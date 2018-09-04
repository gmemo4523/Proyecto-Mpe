package cl.com.ccla.historialpagoturismoagregar;

import java.math.BigDecimal;

public class RequestHistorialTurismo {
    
    private String rut;
    private String numeroComprobante;
    private String fechaComprobante;
    private String idTransaccion;
    private String idTransaccionCaja;
    private String estadoPago;
    private String codigoReserva;
    private String checkOut;
    private String checkIn;
    private String numeroCuota;
    private String centroTuristico;
    private String monto;
    private String fechaPago;
    private String numeroBoleta;
    private String fechaVencimiento;
    private String url;
    
    public RequestHistorialTurismo() {
        super();
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setFechaComprobante(String fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public String getFechaComprobante() {
        return fechaComprobante;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccionCaja(String idTransaccionCaja) {
        this.idTransaccionCaja = idTransaccionCaja;
    }

    public String getIdTransaccionCaja() {
        return idTransaccionCaja;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setNumeroCuota(String numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public String getNumeroCuota() {
        return numeroCuota;
    }

    public void setCentroTuristico(String centroTuristico) {
        this.centroTuristico = centroTuristico;
    }

    public String getCentroTuristico() {
        return centroTuristico;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto() {
        return monto;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setNumeroBoleta(String numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public String getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
