package cl.com.ccla.dashboardnotif;

import cl.com.ccla.dashboard.Dash;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;

public class DashboardNotifImpl {
    public DashboardNotifImpl() {
        super();
    }
    
    public Respuesta ejecutarServicio(Input input, String hostRest) throws IOException {
        
        Gson gson;
        Respuesta respuesta;


        try {
                URL url = new URL("http://"+ hostRest   +"/CclaServices/servicios/DashboardNotificacionBean/DashboardNotificacion");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
                gson = new Gson();
                writer.write(gson.toJson(input));
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
                respuesta = gson.fromJson(jsonString.toString(), Respuesta.class);

                
            } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
            }

        return respuesta;
        
    }
}
