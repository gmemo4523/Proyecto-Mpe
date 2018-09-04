package cl.com.ccla.consultardatosturismo;


import com.sun.org.apache.xml.internal.serialize.Serializer;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Set;

public class CCLACuotaTurismo implements Serializable {
    private static final long serialVersionUID = 1L;

    public CCLACuotaTurismo() {
        super();
    }
            private      BigDecimal                 nroReserva                              ;      
            private     String                  codigoReserva                   ;      
            private     String                checkIn                                 ;      
            private     String                checkOut                                ;      
            private     String                  centro                                  ;      
            private     BigDecimal                 mntPendiente                    ;      
            private     String                  estado                                  ;      
            private     String                  tipoHabitacion                  ;      
            private     Integer                 nroHabitacion                   ;      
            private     Integer                 capacidadHabitacion     ;      
            private     String                fechaGrab                               ;      
            private     String                  numeroComprobante               ;      
            private     BigDecimal                 estadoCi                                ;      
            private     BigDecimal                 montoCi                                 ;      
            private     BigDecimal                 cuentaPeriodo                   ;      
            private     String                  region                                  ;      
            private     String                  codigoSucursal                  ;      
            private     String                  tipoDocumento                   ;      
            private     BigDecimal                 correlativoComprobante;           
            private     Integer                 idCuota                                 ;
            private     String                fechaVencimiento                                 ;  
 

 

    public void setNroReserva(BigDecimal nroReserva) {
        this.nroReserva = nroReserva;
    }

 

    public BigDecimal getNroReserva() {

        return nroReserva;

    }
 

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

 

    public String getCodigoReserva() {

        return codigoReserva;

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

 

    public void setCentro(String centro) {

        this.centro = centro;

    }

 

    public String getCentro() {

        return centro;

    }

 

    public void setMntPendiente(BigDecimal mntPendiente) {

        this.mntPendiente = mntPendiente;

    }

 

    public BigDecimal getMntPendiente() {

        return mntPendiente;

    }
 

    public void setEstado(String estado) {
        this.estado = estado;
    }

 

    public String getEstado() {

        return estado;

    }
 

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
 

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
 

    public void setNroHabitacion(Integer nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }
 

    public Integer getNroHabitacion() {
        return nroHabitacion;
    }
 

    public void setCapacidadHabitacion(Integer capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }
 

    public Integer getCapacidadHabitacion() {
        return capacidadHabitacion;
    }
 

    public void setFechaGrab(String fechaGrab) {
        this.fechaGrab = fechaGrab;
    }
 

    public String getFechaGrab() {
        return fechaGrab;

    }

 

    public void setNumeroComprobante(String numeroComprobante) {

        this.numeroComprobante = numeroComprobante;

    }

 

    public String getNumeroComprobante() {

        return numeroComprobante;

    }

 

    public void setEstadoCi(BigDecimal estadoCi) {

        this.estadoCi = estadoCi;

    }

 

    public BigDecimal getEstadoCi() {

        return estadoCi;

    }

 

    public void setMontoCi(BigDecimal montoCi) {

        this.montoCi = montoCi;

    }

 

    public BigDecimal getMontoCi() {

        return montoCi;

    }
 

    public void setCuentaPeriodo(BigDecimal cuentaPeriodo) {
        this.cuentaPeriodo = cuentaPeriodo;
    }
 

    public BigDecimal getCuentaPeriodo() {
        return cuentaPeriodo;

    }

 

    public void setRegion(String region) {

        this.region = region;

    }

 

    public String getRegion() {

        return region;

    }

 

    public void setCodigoSucursal(String codigoSucursal) {

        this.codigoSucursal = codigoSucursal;
    }
 

    public String getCodigoSucursal() {
        return codigoSucursal;
    }
 

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
 

    public String getTipoDocumento() {
        return tipoDocumento;
    }
 

    public void setCorrelativoComprobante(BigDecimal correlativoComprobante) {
        this.correlativoComprobante = correlativoComprobante;
    }
 

    public BigDecimal getCorrelativoComprobante() {
        return correlativoComprobante;
    }
 

    public void setIdCuota(Integer idCuota) {
        this.idCuota = idCuota;
    }
 

    public Integer getIdCuota() {
        return idCuota;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
