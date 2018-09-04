package cl.com.ccla.dashboardnotif;

import java.io.IOException;

public class Tester {
    public Tester() {
        super();
    }

    public static void main(String[] args) throws IOException {
       Input input = new Input();
       input.setIdtrx("00420180828398799");
       input.setUrl("qa-osbweb:8005");
       
       
        DashboardNotifImpl tester = new DashboardNotifImpl();
        
        Respuesta respuesta = tester.ejecutarServicio(input, "127.0.0.1:7101");
        
        String asd ="";
        System.out.println(respuesta.getDescOperacion());
       
    }
}
