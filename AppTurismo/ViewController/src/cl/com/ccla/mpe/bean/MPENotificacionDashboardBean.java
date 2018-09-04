package cl.com.ccla.mpe.bean;

//import cl.com.ccla.mpe.type.dashboardnotificacion.CCLAMWClientsType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.DetalleErrorType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.EntWSDSHNotifProdServiceInReqType;
//import cl.com.ccla.mpe.type.dashboardnotificacion.EntWSDSHNotifProdServiceOutResTYPE;
//import cl.com.ccla.mpe.type.dashboardnotificacion.RQDataWP;
//import cl.com.ccla.mpe.type.dashboardnotificacion.RQNotificarTrxWP;
//import cl.com.ccla.mpe.type.dashboardnotificacion.RSNotificarTrxWP;
//import cl.com.ccla.mpe.webservice.DBNotificacion.WSDSHNotifProdService;
//import cl.com.ccla.mpe.webservice.dashboardnotificacion.Exception;
//import cl.com.ccla.mpe.webservice.dashboardnotificacion.WSDSHNotifProdIF;
import cl.com.ccla.mpe.type.DBNotificacion.RQDataWP;
import cl.com.ccla.mpe.type.DBNotificacion.RQNotificarTrxWP;
import cl.com.ccla.mpe.type.DBNotificacion.RSNotificarTrxWP;
import cl.com.ccla.mpe.webservice.DBNotificacion.WSDSHNotifProdIF;
import cl.com.ccla.mpe.webservice.DBNotificacion.WSDSHNotifProdService;


public class MPENotificacionDashboardBean {



    RQNotificarTrxWP reqOSB;
    
    RSNotificarTrxWP resOSB;
    
    public static void main(String[] args) {
        
           MPENotificacionDashboardBean mpe = new MPENotificacionDashboardBean();
         CCLANotificacionDashboard cCLANotificacionDashboard = new CCLANotificacionDashboard();
           RQDataWP datanotifica = new RQDataWP();
           
           datanotifica.setResponseCode("0");
           datanotifica.setCommerceCode("?");
           datanotifica.setSharesNumber("?");
           datanotifica.setAmount("32400");
           datanotifica.setAccountingDate("0720");
           datanotifica.setAuthorizationCode("1213");
           datanotifica.setBuyOrder("248042980");
           datanotifica.setCardExpirationDate("2109");
           datanotifica.setCardNumber("6623");
           datanotifica.setPaymentTypeCode("VD");
           datanotifica.setResponseCode("0");
           datanotifica.setSessionId("aj2h4kj2");
           datanotifica.setToken("eeb466ea47a56b1ab620574be39d4ab68500a12bb57ab1f686c60a963213e759");
           datanotifica.setTransactionDate("20182007");
           datanotifica.setUrlRedirection("www.caja.cl");
           datanotifica.setVci("TSY");
           
           cCLANotificacionDashboard.setDatanotifica(datanotifica);
           cCLANotificacionDashboard.setIdtrx("004201807201357");
           cCLANotificacionDashboard.setTipoMov("2330");
            
        
            mpe.notificacion(cCLANotificacionDashboard);    
        
        }
    

    public void notificacion(CCLANotificacionDashboard cCLANotificacionDashboard){
        

        
        WSDSHNotifProdService wSDSHNotifProdService = new WSDSHNotifProdService();
        WSDSHNotifProdIF wSDSHNotifProdIF = (WSDSHNotifProdIF)wSDSHNotifProdService.getWSDSHNotifProdPort();
            
            
            reqOSB = new RQNotificarTrxWP();
            resOSB = new RSNotificarTrxWP();
            
                reqOSB.setIDTRX(cCLANotificacionDashboard.getIdtrx());
                reqOSB.setTipoMov(cCLANotificacionDashboard.getTipoMov());
                reqOSB.setDataWP(cCLANotificacionDashboard.getDatanotifica());              
    
    
       //resOSB = impl.wsdshNotifProdService(reqOSB, header);


        //        resOSB.getStatus();
//        resOSB.getEstadoOperacion();
//        String res = resOSB.getDescOperacion();


        try {
            resOSB = wSDSHNotifProdIF.notificarTrxWP(reqOSB);
        } catch (Exception e) {
            System.out.println("alida");
        }
    }
    
    
    
    
    
}
