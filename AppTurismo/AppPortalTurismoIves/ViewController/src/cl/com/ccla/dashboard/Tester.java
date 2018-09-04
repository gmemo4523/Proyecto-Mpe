package cl.com.ccla.dashboard;

import java.io.IOException;

import java.util.ArrayList;

public class Tester {
    public Tester() {
        super();
    }

    public static void main(String[] args) throws IOException {
        DashboardImpl tester = new DashboardImpl();
        
        
        Status status ;
        ArrayList<Det> lista = new ArrayList<Det>();
        Det detalle = new Det();
        Dash dash = new Dash();
        
        detalle.setIdTrx("0");
        detalle.setCodigoProducto("004");
        detalle.setIdItem("1");
        detalle.setRutPersona("5148781");
        detalle.setRutEmpresa("61979440");
        detalle.setMontoAPagar("13250");
        detalle.setMontoTotal("0");
        detalle.setMontoSaldo("0");
        detalle.setDescripcion("AGX2K");
        detalle.setCcRegion("13");
        detalle.setCcSucursal("36");
        detalle.setCcTipoDoc("0");
        detalle.setCcComprobante("63229");
        detalle.setCcPeriodo("2018");
        
        lista.add(detalle);
        
        
        dash.setTipoDetalle("2");
        dash.setCodigoProducto("004");
        dash.setRutPersona(5148781);
        dash.setRutEmpresa(61979440);
        dash.setMonto(13250);
        dash.setUsuarioGraba("DASHBOARD");
        dash.setUrlRetorno("http://www.cajalosandes.cl/turismo/pagoOnline/dashboard/");
        dash.setDetalle(lista);
        dash.setUrl("qa-osbweb:8005");
        
        status = tester.ejecutarServicio(dash, "127.0.0.1:7101");
        System.out.println(status.getIdtrix());
        
    }
}
