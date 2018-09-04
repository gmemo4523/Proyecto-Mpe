package cl.com.ccla.mpe.bean;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.datatype.XMLGregorianCalendar;


public class CCLAHistorialTurismoConsultar implements Serializable {
    private static final long serialVersionUID = 1L;

    private BigDecimal rutPersona;
    private String numeroComprobante;
    private Calendar fechaComprobante;
    private String codigoReserva;
    private Calendar checkOut;
    private Calendar checkIn;
    private BigDecimal numeroCuota;
    private String centroTuristico;
    private BigDecimal monto;
    private Calendar fechaPago;
    
    private Calendar fechaVencimiento;
    private String idTransaccion;
    private String idTransaccionCaja;
    private String estadoPago;
    
    private BigDecimal numeroBoleta;




    public BigDecimal getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(BigDecimal rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public Calendar getFechaComprobante() {
        return fechaComprobante;
    }

    public void setFechaComprobante(Calendar fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Calendar getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Calendar checkOut) {
        this.checkOut = checkOut;
    }

    public Calendar getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Calendar checkIn) {
        this.checkIn = checkIn;
    }

    public BigDecimal getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(BigDecimal numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public String getCentroTuristico() {
        return centroTuristico;
    }

    public void setCentroTuristico(String centroTuristico) {
        this.centroTuristico = centroTuristico;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Calendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(BigDecimal numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
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
}
