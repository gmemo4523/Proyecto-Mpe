package cl.com.ccla.bean;

import java.io.Serializable;

import java.math.BigDecimal;



public class CCLAPagoTurismo implements Serializable{
    private static final long serialVersionUID = 0L;
    private boolean status=false;
    private String codReserva;
    private String checkIn;
    private String checkOut;
    private String nroCuota;
    private String centroTuristico;
    private BigDecimal monto;
    private String numeroComprobante;
    private String fechaVencimiento;
    private String estadoPago;
    
    //private List<CCLAPagoTurismo> list = new ArrayList<CCLAPagoTurismo>();
    public CCLAPagoTurismo() {
        super();
    }
    
    public CCLAPagoTurismo(String codReserva,String checkIn,String checkOut,String nroCuota,String centroTuristico,String monto,String nroComprobante,String estado,String fechaVencimiento){
        this.status=status;
        this.codReserva=codReserva;
        this.checkIn=checkIn;
        this.checkOut=checkOut;
        this.nroCuota=nroCuota;
        this.centroTuristico=centroTuristico;
        this.monto=new BigDecimal(monto);
        this.numeroComprobante=nroComprobante;
        this.estadoPago= estado;
        this.fechaVencimiento=fechaVencimiento;
        
        
    }






    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setNroCuota(String nroCuota) {
        this.nroCuota = nroCuota;
    }

    public String getNroCuota() {
        return nroCuota;
    }

    public void setCentroTuristico(String centroTuristico) {
        this.centroTuristico = centroTuristico;
    }

    public String getCentroTuristico() {
        return centroTuristico;
    }

   

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

  
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }
}
