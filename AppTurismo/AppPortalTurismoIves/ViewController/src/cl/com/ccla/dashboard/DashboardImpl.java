package cl.com.ccla.dashboard;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;


public class DashboardImpl {
    public DashboardImpl() {
        super();
    }
    
    
    public Status ejecutarServicio(Dash dash, String hostRest) throws IOException {
        
        Gson gson;
        Status status;


        try {
                URL url = new URL("http://"+ hostRest   +"/CclaServices/servicios/DashboardBean/Dashboard");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
                gson = new Gson();
                writer.write(gson.toJson(dash));
                writer.close();
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuffer jsonString = new StringBuffer();
                String line;
                while ((line = br.readLine()) != null) {
                        jsonString.append(line);
                }
                br.close();
                connection.disconnect();

                gson = new Gson();
                status = gson.fromJson(jsonString.toString(), Status.class);

                
            } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
            }

        return status;
        
    }
}
