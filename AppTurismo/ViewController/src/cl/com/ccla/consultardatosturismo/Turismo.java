package cl.com.ccla.consultardatosturismo;

import java.math.BigDecimal;


public class Turismo {

    private BigDecimal reservaID;
    private String codigoReserva;
    private String checkIn;
    private String checkOut;
    private String centro;
    private BigDecimal mntPendiente;
    private String estado;
    private String tipoHabitacion;
    private BigDecimal nroHabitacion;
    private BigDecimal capacidadHabitacion;
    private String fechaGrab;
    private String numeroComprobante;
    private BigDecimal estadoCi;
    private BigDecimal montoCi;
    private BigDecimal cuentaPeriodo;
    private String region;
    private String codigoSucursal;
    private String tipoDocumento;
    private BigDecimal correlativoComprobante;
    private BigDecimal idCuota;
    private String fechaVencimiento;
    
    public Turismo() {
        super();
    }

    public BigDecimal getReservaID() {
        return reservaID;
    }

    public void setReservaID(BigDecimal reservaID) {
        this.reservaID = reservaID;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public BigDecimal getMntPendiente() {
        return mntPendiente;
    }

    public void setMntPendiente(BigDecimal mntPendiente) {
        this.mntPendiente = mntPendiente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public BigDecimal getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(BigDecimal nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public BigDecimal getCapacidadHabitacion() {
        return capacidadHabitacion;
    }

    public void setCapacidadHabitacion(BigDecimal capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }

    public String getFechaGrab() {
        return fechaGrab;
    }

    public void setFechaGrab(String fechaGrab) {
        this.fechaGrab = fechaGrab;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public BigDecimal getEstadoCi() {
        return estadoCi;
    }

    public void setEstadoCi(BigDecimal estadoCi) {
        this.estadoCi = estadoCi;
    }

    public BigDecimal getMontoCi() {
        return montoCi;
    }

    public void setMontoCi(BigDecimal montoCi) {
        this.montoCi = montoCi;
    }

    public BigDecimal getCuentaPeriodo() {
        return cuentaPeriodo;
    }

    public void setCuentaPeriodo(BigDecimal cuentaPeriodo) {
        this.cuentaPeriodo = cuentaPeriodo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public BigDecimal getCorrelativoComprobante() {
        return correlativoComprobante;
    }

    public void setCorrelativoComprobante(BigDecimal correlativoComprobante) {
        this.correlativoComprobante = correlativoComprobante;
    }

    public BigDecimal getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(BigDecimal idCuota) {
        this.idCuota = idCuota;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
