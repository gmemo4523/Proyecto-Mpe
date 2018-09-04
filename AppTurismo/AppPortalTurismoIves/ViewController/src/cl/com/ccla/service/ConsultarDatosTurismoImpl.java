package cl.com.ccla.service;


import cl.com.ccla.bean.CCLACuotaTurismo;
import cl.com.ccla.vo.Input;
import cl.com.ccla.vo.ListaTurismo;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class ConsultarDatosTurismoImpl {
    public ConsultarDatosTurismoImpl() {
        super();
    }
    
    public ArrayList<CCLACuotaTurismo> ejecutarServicio(String rut, String hostRest, String hostOsb) throws IOException {
        Input request = new Input();
        request.setRut(rut);
        request.setUrl(hostOsb);
        Gson gson;
        ListaTurismo lista = new ListaTurismo();
        CCLACuotaTurismo cuota = new CCLACuotaTurismo();
        ArrayList<CCLACuotaTurismo> respuesta = new ArrayList<CCLACuotaTurismo>();
    
        try {
                URL url = new URL("http://"+ hostRest   +"/CclaServices/servicios/ConsultaDatosTurismoBean/DatosTurismo");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
                gson = new Gson();
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
                lista = gson.fromJson(jsonString.toString(), ListaTurismo.class);
                for (int i = 0; i < lista.getListaTurismo().size(); i++) {
                    cuota = new CCLACuotaTurismo();
                    cuota.setNroReserva(lista.getListaTurismo().get(i).getReservaID());
                    cuota.setCodigoReserva(lista.getListaTurismo().get(i).getCodigoReserva());
                    cuota.setCheckIn(lista.getListaTurismo().get(i).getCheckIn());
                    cuota.setCheckOut(lista.getListaTurismo().get(i).getCheckOut());
                    cuota.setCentro(lista.getListaTurismo().get(i).getCentro());
                    cuota.setMntPendiente(lista.getListaTurismo().get(i).getMntPendiente());
                    cuota.setEstado(lista.getListaTurismo().get(i).getEstado());
                    cuota.setTipoHabitacion(lista.getListaTurismo().get(i).getTipoHabitacion());
                    cuota.setNroHabitacion(new Integer(lista.getListaTurismo().get(i).getNroHabitacion().toString()));
                    cuota.setCapacidadHabitacion(new Integer(lista.getListaTurismo().get(i).getCapacidadHabitacion().toString()));
                    cuota.setFechaVencimiento(lista.getListaTurismo().get(i).getFechaGrab());
                    cuota.setNumeroComprobante(lista.getListaTurismo().get(i).getNumeroComprobante());
                    cuota.setEstadoCi(lista.getListaTurismo().get(i).getEstadoCi());
                    cuota.setMontoCi(lista.getListaTurismo().get(i).getMontoCi());
                    cuota.setCuentaPeriodo(lista.getListaTurismo().get(i).getCuentaPeriodo());
                    cuota.setRegion(lista.getListaTurismo().get(i).getRegion());
                    cuota.setCodigoSucursal(lista.getListaTurismo().get(i).getCodigoSucursal());
                    cuota.setTipoDocumento(lista.getListaTurismo().get(i).getTipoDocumento());
                    cuota.setCorrelativoComprobante(lista.getListaTurismo().get(i).getCorrelativoComprobante());
                    cuota.setIdCuota(new Integer(lista.getListaTurismo().get(i).getIdCuota().toString()));
                    cuota.setFechaVencimiento(lista.getListaTurismo().get(i).getFechaVencimiento());
                    cuota.setCuota(String.valueOf(i+1));
                    respuesta.add(cuota);
                  }
            } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
            }
        return respuesta;
       }
    }
