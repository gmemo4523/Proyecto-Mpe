package cl.com.ccla.mpe.bean;

import cl.com.ccla.mpe.type.DBNotificacion.RQDataWP;

//import cl.com.ccla.mpe.type.dashboardnotificacion.CCLAMWClientsType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.DetalleErrorType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.EntWSDSHNotifProdServiceInReqType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.EntWSDSHNotifProdServiceOutResTYPE;
//import cl.com.ccla.mpe.type.dashboardnotificacion.RQDataWP;

public class CCLANotificacionDashboard {


          private RQDataWP datanotifica;
          private String idtrx;
          private String tipoMov;


    public void setDatanotifica(RQDataWP datanotifica) {
        this.datanotifica = datanotifica;
    }

    public RQDataWP getDatanotifica() {
        return datanotifica;
    }

    public void setIdtrx(String idtrx) {
        this.idtrx = idtrx;
    }

    public String getIdtrx() {
        return idtrx;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public String getTipoMov() {
        return tipoMov;
    }
}
