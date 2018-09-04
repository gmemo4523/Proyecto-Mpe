package cl.com.ccla.historialpagoturismoagregar;

import cl.com.ccla.consultardatosturismo.CCLACuotaTurismo;
import cl.com.ccla.consultardatosturismo.ListaTurismo;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.ArrayList;

public class HistorialPagoTurismoAgregarImpl {
    public HistorialPagoTurismoAgregarImpl() {
        super();
    }
    
    
    
    public ResponsePago ejecutarServicio(RequestHistorialTurismo request, String hostRest) throws IOException {
        
        ResponsePago respon;
        Gson gson;

        try {
                URL url = new URL("http://"+ hostRest   +"/CclaServices/servicios/HistorialPagoTurismoBean/HistorialPagoTurismo");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
                gson = new Gson();
                String lalala = gson.toJson(request);
                writer.write(gson.toJson(request));
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
                respon = gson.fromJson(jsonString.toString(), ResponsePago.class);
            
                
                
            } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
            }
        
        
        return respon;
        
    }
    
    
}
