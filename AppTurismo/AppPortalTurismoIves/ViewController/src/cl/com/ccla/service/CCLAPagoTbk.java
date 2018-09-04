package cl.com.ccla.service;

import cl.com.ccla.bean.CCLAPagoTurismo;
import cl.com.ccla.bean.MpeServiceTbk;
import cl.com.ccla.dashboard.Dash;
import cl.com.ccla.dashboard.DashboardImpl;
import cl.com.ccla.dashboard.Det;
import cl.com.ccla.dashboard.Status;
import cl.com.ccla.dashboardnotif.DashboardNotifImpl;
import cl.com.ccla.dashboardnotif.Input;
import cl.com.ccla.dashboardnotif.Respuesta;
import cl.com.ccla.historialpagoturismoagregar.HistorialPagoTurismoAgregarImpl;
import cl.com.ccla.historialpagoturismoagregar.RequestHistorialTurismo;
import cl.com.ccla.historialpagoturismoagregar.ResponsePago;
import cl.com.ccla.mpe.bean.CCLANotificacionDashboard;
import cl.com.ccla.mpe.bean.MPENotificacionDashboardBean;
import cl.com.ccla.mpe.type.DBNotificacion.RQDataWP;
import cl.com.ccla.type.TransactionResultOutput;

import cl.com.ccla.utils.CCLAUtils;

import java.io.IOException;
import java.math.BigInteger;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CCLAPagoTbk {
private final String HostRest=  "pwpappqa4:9000";

 public void webpayNormalGetResult( HttpServletRequest request, HttpSession session) {
     String  token = request.getParameter("token_ws");
       
     MpeServiceTbk mpeServiceTbk=new MpeServiceTbk();
     TransactionResultOutput tr=new TransactionResultOutput();
     tr= mpeServiceTbk.getResult(session.getAttribute("tokentbk").toString());
     System.out.println(tr.getUrlRedirection());
     
     // Invoca a Notificar Transaccin
     String tokenTrax=session.getAttribute("tokentbk").toString();
     String idTrxCcla=session.getAttribute("idTransaccion").toString();
     notificaTrsanccionCajaPagadora(tr,tokenTrax,idTrxCcla);
     
     //
     String webBanco=tr.getUrlRedirection()+"?token_ws="+session.getAttribute("tokentbk").toString(); 
     System.out.println(webBanco);
     String  function="window.open('"+webBanco+"','_blank');";
     CCLAUtils.callGenericJsFunction(function); 
 }
  
    public void GuardaTransaccionTbk( ) {
     }
    
    
    public String GuardaHistorialTurismo(ArrayList<CCLAPagoTurismo> selectedListTurismo,BigInteger rut,String idTRansaccion,String monto) throws ParseException {
       String resul="exito";
       ResponsePago res ;
       HistorialPagoTurismoAgregarImpl tester = new HistorialPagoTurismoAgregarImpl();
        RequestHistorialTurismo req = new RequestHistorialTurismo();
      
             
         for (CCLAPagoTurismo turismoSeleccionado :selectedListTurismo ) {
            
               req.setRut(rut.toString());
                 req.setNumeroComprobante(turismoSeleccionado.getNumeroComprobante());
                 req.setFechaComprobante("2008-09-29T21:49:45");
                 req.setIdTransaccion(idTRansaccion);
                 req.setIdTransaccionCaja(idTRansaccion);
                 req.setEstadoPago("1");
                 req.setCodigoReserva(turismoSeleccionado.getCodReserva());
             
                 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                 DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
                   dateFormat.setLenient(false);
             
             
                   Date date = dateFormat.parse(turismoSeleccionado.getCheckOut());
                  String date2=date.toString();
                  String    output = formatter.format(date);
                  req.setCheckOut(output+"T21:49:45");
             
             
                 date = dateFormat.parse(turismoSeleccionado.getCheckIn());
                   date2=date.toString();
                 output = formatter.format(date);
                 req.setCheckIn(output+"T21:49:45");
             
             
             
             
             
                 req.setNumeroCuota(turismoSeleccionado.getNroCuota());
                 req.setCentroTuristico(turismoSeleccionado.getCentroTuristico());
                 req.setMonto(turismoSeleccionado.getMonto().toString());
                 req.setFechaPago("2008-09-28T21:49:45");
                 req.setNumeroBoleta("3");
                 req.setFechaVencimiento("2008-09-28T21:49:45");
                 req.setUrl("qa-osbweb:8005");
             
             }
             try {
                 res = tester.ejecutarServicio(req, HostRest);
             } catch (IOException e) {
                 System.out.println(e.getMessage());
                 resul="Error";
             }
        
          return  resul;
        }
        
   public String CreaTrsanccionCajaPagadora(ArrayList<CCLAPagoTurismo> selectedListTurismo,BigInteger rut,String monto) throws IOException {
        
          DashboardImpl dashBoard = new DashboardImpl();
          Status status;
          ArrayList<Det> lista = new ArrayList<Det>();
          Det detalle = new Det();
          Dash dash = new Dash();
          int i=1;
            dash.setTipoDetalle("2");
            dash.setCodigoProducto("004");
            dash.setRutPersona(rut.longValue());
            dash.setRutEmpresa(1111);
            dash.setMonto(Long.parseLong(monto));
            dash.setUsuarioGraba("MPE");
            dash.setUrlRetorno("http://www.cajalosandes.cl/turismo/pagoOnline/dashboard/");
            dash.setUrl("qa-osbweb:8005");
          
          for (CCLAPagoTurismo turismoSeleccionado :selectedListTurismo ) {
                  detalle=new Det();
                  turismoSeleccionado.getNumeroComprobante();
                  turismoSeleccionado.getCodReserva();
                  turismoSeleccionado.getCheckOut();
                  turismoSeleccionado.getCheckIn();
                  turismoSeleccionado.getCentroTuristico();
                  turismoSeleccionado.getNroCuota();
                  detalle.setIdTrx("0");
                  detalle.setCodigoProducto("004");
                  detalle.setIdItem(String.valueOf(i)); //
                  detalle.setRutPersona(String.valueOf(rut)); //String.valueOf(rut));
                  detalle.setRutEmpresa("1111");
                  detalle.setMontoAPagar(turismoSeleccionado.getMonto().toString());   //turismoSeleccionado.getMonto().toString());
                  detalle.setMontoTotal("0");
                  detalle.setMontoSaldo("0");
                  detalle.setDescripcion(turismoSeleccionado.getCodReserva());        //turismoSeleccionado.getCodReserva());
                  detalle.setCcRegion(turismoSeleccionado.getNumeroComprobante().substring(4,6));
                  detalle.setCcSucursal(turismoSeleccionado.getNumeroComprobante().substring(6,8));
                  detalle.setCcTipoDoc("0");
                  detalle.setCcComprobante(turismoSeleccionado.getNumeroComprobante().substring(9,14));
                  detalle.setCcPeriodo(turismoSeleccionado.getNumeroComprobante().substring(0, 4));
                  lista.add(detalle);
              i++;
              }
          
     
          dash.setDetalle(lista);
          status = dashBoard.ejecutarServicio(dash,HostRest);
          System.out.println("ID TRANSACCION"+ status.getIdtrix());
          return  status.getIdtrix();
          
      }
    
    
    
    public void notificaTrsanccionCajaPagadora(TransactionResultOutput result,String token,String idTransaccion) {
          MPENotificacionDashboardBean mpe = new MPENotificacionDashboardBean();
          CCLANotificacionDashboard cCLANotificacionDashboard = new CCLANotificacionDashboard();
          RQDataWP datanotifica = new RQDataWP();
                       
          String authorizationCode = result.getDetailOutput().get(0).getAuthorizationCode();
          String authorizedAmount = result.getDetailOutput().get(0).getAmount().toString();
                       
          datanotifica.setResponseCode(String.valueOf(result.getDetailOutput().get(0).getResponseCode()));
          datanotifica.setCommerceCode(result.getDetailOutput().get(0).getCommerceCode());
          datanotifica.setSharesNumber(result.getDetailOutput().get(0).getSharesNumber().toString());
          datanotifica.setAmount(authorizedAmount);
          datanotifica.setAccountingDate(result.getAccountingDate());
          datanotifica.setAuthorizationCode(authorizationCode);
          datanotifica.setBuyOrder(result.getBuyOrder());
          datanotifica.setCardExpirationDate(result.getCardDetail().getCardExpirationDate());
          datanotifica.setCardNumber(result.getCardDetail().getCardNumber());
          datanotifica.setPaymentTypeCode(result.getDetailOutput().get(0).getPaymentTypeCode());
          datanotifica.setResponseCode(String.valueOf(result.getDetailOutput().get(0).getResponseCode()));
          datanotifica.setSessionId(result.getSessionId());
          datanotifica.setToken(token);
          datanotifica.setTransactionDate("20182007");
          datanotifica.setUrlRedirection("http://www.caja.cl");
          datanotifica.setVci(result.getVCI());
          
          cCLANotificacionDashboard.setDatanotifica(datanotifica);
          cCLANotificacionDashboard.setIdtrx(idTransaccion);
          cCLANotificacionDashboard.setTipoMov("2330");
          mpe.notificacion(cCLANotificacionDashboard);    
        
}
}
