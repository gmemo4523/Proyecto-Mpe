package cl.com.ccla.bean;

import java.io.Serializable;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CCLAHistorialTurismo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String codReserva;
    private BigDecimal nroCuota;
    private String centroTuristico;
    private BigDecimal monto;
    private String fechaPago;
    private String nroBoleta;
    private String rutPersona;
    private String idTransaccionCcla;
    private String numeroComprobante;
    private String estadoPago;
    private String checkOut;
    private String checkIn;
    private String fechaVencimiento;
    private String idTransaccionTbk;
    private String numeroBoleta;
    
    private List<CCLAHistorialTurismo> list = new ArrayList<CCLAHistorialTurismo>();
    
    public CCLAHistorialTurismo() {
        super();
    }
    
    public CCLAHistorialTurismo(String codReserva, BigDecimal nroCuota, String centroTuristico, BigDecimal monto, String fechaPago, String nroBoleta) {
        this.codReserva=codReserva;
        this.nroCuota=nroCuota;
        this.centroTuristico=centroTuristico;
        this.monto=monto;
        this.fechaPago=fechaPago;
        this.nroBoleta=nroBoleta;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setNroCuota(BigDecimal nroCuota) {
        this.nroCuota = nroCuota;
    }

    public BigDecimal getNroCuota() {
        return nroCuota;
    }

    public void setCentroTuristico(String centroTuristico) {
        this.centroTuristico = centroTuristico;
    }

    public String getCentroTuristico() {
        return centroTuristico;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }


    public void setNroBoleta(String nroBoleta) {
        this.nroBoleta = nroBoleta;
    }

    public String getNroBoleta() {
        return nroBoleta;
    }


    public void setList(List<CCLAHistorialTurismo> list) {
        this.list = list;
    }

    public List<CCLAHistorialTurismo> getList() {
        return list;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setIdTransaccionCcla(String idTransaccionCcla) {
        this.idTransaccionCcla = idTransaccionCcla;
    }

    public String getIdTransaccionCcla() {
        return idTransaccionCcla;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
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

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setIdTransaccionTbk(String idTransaccionTbk) {
        this.idTransaccionTbk = idTransaccionTbk;
    }

    public String getIdTransaccionTbk() {
        return idTransaccionTbk;
    }

    public void setNumeroBoleta(String numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public String getNumeroBoleta() {
        return numeroBoleta;
    }
}
