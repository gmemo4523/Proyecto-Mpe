package cl.com.ccla.historialpagoturismoagregar;

import java.io.IOException;

import java.math.BigDecimal;

public class tester {
    public tester() {
        super();
    }

    public static void main(String[] args) throws IOException {
       
        RequestHistorialTurismo req = new RequestHistorialTurismo();
        ResponsePago res ;
        req.setRut("25991102");
        req.setNumeroComprobante("6");
        req.setFechaComprobante("2008-09-28T21:49:45");
        req.setIdTransaccion("1112233321");
        req.setIdTransaccionCaja("414331213");
        req.setEstadoPago("1");
        req.setCodigoReserva("2");
        req.setCheckOut("2008-09-28T21:49:45");
        req.setCheckIn("2008-09-28T21:49:45");
        req.setNumeroCuota("2");
        req.setCentroTuristico("er");
        req.setMonto("100");
        req.setFechaPago("2008-09-28T21:49:45");
        req.setNumeroBoleta("3");
        req.setFechaVencimiento("2008-09-28T21:49:45");
        req.setUrl("qa-osbweb:8005");
        HistorialPagoTurismoAgregarImpl tester = new HistorialPagoTurismoAgregarImpl();
        res = tester.ejecutarServicio(req, "127.0.0.1:7101");     
     }
}
