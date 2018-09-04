package cl.com.ccla.consultardatosturismo;

import java.io.IOException;

import java.util.ArrayList;

public class Tester {
    public Tester() {
        super();
    }

    public static void main(String[] args) throws IOException{
        ConsultarDatosTurismoImpl tester = new ConsultarDatosTurismoImpl();
        
        ArrayList<CCLACuotaTurismo> lista = new ArrayList<CCLACuotaTurismo>();
        lista = tester.ejecutarServicio("8990310","127.0.0.1:7101","qa-osbweb:8005");
    }
}
