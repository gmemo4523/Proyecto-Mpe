package cl.com.ccla.service;


import cl.com.ccla.bean.CCLACuotaTurismo;
import cl.com.ccla.bean.CCLAPagoTurismo;
import cl.com.ccla.bean.MPECreditoTurismoBean;
import cl.com.ccla.bean.MpeServiceTbk;
import cl.com.ccla.bean.validacaja.CajaBean;
import cl.com.ccla.bean.validacaja.ValidaCaja;
import cl.com.ccla.type.InitMpeTbkVO;
import cl.com.ccla.type.InitVO;

import cl.com.ccla.utils.ADFUtils;
import cl.com.ccla.utils.CCLAUtils;

import java.io.IOException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.xml.namespace.QName;

import oracle.adf.share.logging.ADFLogger;


public class CCLAPagoElectronicoTurismo  {
  
    private List<CCLAPagoTurismo> listaHistorialTurismo;
    private List<CCLACuotaTurismo> listaTurismoT;
    private String codReservaSeleccionado = null;
    private String nroComprobanteSeleccionado = null;
    private boolean flag = true;
    private BigDecimal totalTurismo;
    private boolean selectAll;
    private int posicion;
   //   private CCLAUserBean usuario = new CCLAUserBean();
    private BigInteger rut = null;
    private String digitoVerificador = "";
    private static final ADFLogger logger =
    ADFLogger.createADFLogger(CCLAPagoElectronicoTurismo.class);
    private boolean botonPago = false;
    private CCLACuotaTurismo popupDetalle;
   
    ArrayList<CCLAPagoTurismo> selectedListTurismo =
    new ArrayList<CCLAPagoTurismo>();
    private String rutPrueba;
    private String mensaje;
    private String codReservaPopup = null;

    private     String                codigoReserva;      
    private     String                checkIn;      
    private     String                checkOut;      
    private     String                fechaVenc;
    private     String                centro;      
    private     String                estado;      
    private     String                tipoHabitacion;      
    private     Integer               nroHabitacion;      
    private     Integer               capacidadHabitacion;      
    private     String                numeroComprobante;      
    private     String                estadoCi;      
    private     String                montoCi;      
    private     String                cuota                                   ;      
    private     String                idCuota                                 ;
    
    public CCLAPagoElectronicoTurismo() throws IOException {
        this.selectedListTurismo=null;
        this.listaHistorialTurismo=null;
        refreshPage();
        initialPago();
    }

    protected void refreshPage() {
          FacesContext fc = FacesContext.getCurrentInstance();
          String refreshpage = fc.getViewRoot().getViewId();
     ViewHandler ViewH =
     fc.getApplication().getViewHandler();
          UIViewRoot UIV = ViewH.createView(fc,refreshpage);
          UIV.setViewId(refreshpage);
          fc.setViewRoot(UIV);
    }
    

   public void llenarlistaTurismo(String rut) {

        listaHistorialTurismo = new ArrayList<CCLAPagoTurismo>();
        MPECreditoTurismoBean        mpeBean      = new MPECreditoTurismoBean();
        ConsultarDatosTurismoImpl consultaTurismo = new ConsultarDatosTurismoImpl();
        listaTurismoT = new ArrayList<CCLACuotaTurismo>();

        String host="pwpappqa4:9000";
        try {
            listaTurismoT = consultaTurismo.ejecutarServicio(rut,host,"qa-osbweb:8005");
        } catch (IOException e) {
        }
       String  codReserva="";
       String  auxCodReserva="";
       int l=1;
       String nrocuota="";
       for(int i=0;i<listaTurismoT.size();i++){
            if (i==0) 
         {
               auxCodReserva=  listaTurismoT.get(i).getCodigoReserva();   
         }
            if (auxCodReserva.equals(listaTurismoT.get(i).getCodigoReserva())) {
             nrocuota = String.valueOf(l);
         }
         else 
         {
             auxCodReserva=listaTurismoT.get(i).getCodigoReserva();
             nrocuota = String.valueOf(1);
             l=1;
         }
         l++;    
         int estadoCi=Integer.parseInt(listaTurismoT.get(i).getEstadoCi().toBigInteger().toString());
            System.out.println(listaTurismoT.get(i).getEstado());
         if ( estadoCi==0 || estadoCi==6 ){
         String checkin  = listaTurismoT.get(i).getCheckIn();
         String checkout  = listaTurismoT.get(i).getCheckOut();
         codReserva= listaTurismoT.get(i).getCodigoReserva();
         String centro   =  listaTurismoT.get(i).getCentro();
         String monto = listaTurismoT.get(i).getMontoCi().toString();
         String comprobante= listaTurismoT.get(i).getNumeroComprobante();
         String fechaVenc=listaTurismoT.get(i).getFechaVencimiento();
         
         fechaVenc = fechaVenc.replace("12:00", "");
         
          // int i =listaTurismoT.get(i).get;
         String estadoPago= "Disponible";
         SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");  
         boolean _estado=true;
         CCLAPagoTurismo historial1 =
         new CCLAPagoTurismo(codReserva,checkin,checkout,nrocuota, centro,monto,comprobante,estadoPago,fechaVenc);
         listaHistorialTurismo.add(historial1);
       }
     }
   }

  

    public void actualizarTotalTurismo(ValueChangeEvent valueChangeEvent) {
         boolean newValue;
        newValue = (Boolean)valueChangeEvent.getNewValue();
        totalTurismo = new BigDecimal("0");
        
      if (null != nroComprobanteSeleccionado) {
            if (null != listaHistorialTurismo && !listaHistorialTurismo.isEmpty()) {

             for (CCLAPagoTurismo turismo : listaHistorialTurismo) {
                    System.out.println("turismo " + turismo.getNumeroComprobante() +
                                       " monto: " + turismo.getMonto());
                }
                System.out.println("#################   LISTA COMPLETA  #################");

                for (CCLAPagoTurismo turismo : listaHistorialTurismo) {
                    if (turismo.getNumeroComprobante().equals(nroComprobanteSeleccionado)) {
                        if (newValue) {
                            System.out.println("ADD: cod. " +
                                               nroComprobanteSeleccionado);
                            selectedListTurismo.add(turismo);
                        } else {
                            selectedListTurismo.remove(turismo);
                            System.out.println("REM: cod. " +
                                               nroComprobanteSeleccionado);
                        }
                    }
                }
            }
            System.out.println("la cantidad de seleccionados es -- > " +
                               selectedListTurismo.size());
            for (CCLAPagoTurismo turismoSeleccionado : selectedListTurismo) {
                totalTurismo =
                        totalTurismo.add(turismoSeleccionado.getMonto());
            }
        }
   }

    
public void irTbk() throws IOException {
      
    CCLAPagoTbk cclaPagoTbk=new CCLAPagoTbk();
    String idTransaccion=cclaPagoTbk.CreaTrsanccionCajaPagadora(selectedListTurismo,rut,totalTurismo.toString());
    String Resultado;

        try {
            Resultado =
                    cclaPagoTbk.GuardaHistorialTurismo(selectedListTurismo,rut,idTransaccion,totalTurismo.toString());
        } catch (ParseException e) {
        }
        HttpServletRequest request = (HttpServletRequest) (FacesContext.getCurrentInstance().getExternalContext().getRequest());
    HttpSession session= (HttpSession) (FacesContext.getCurrentInstance().getExternalContext().getSession(true));

    String url= request.getRequestURL().toString()+"?action=webpayNormalGetResult";
    MpeServiceTbk mpeServiceTbk=new MpeServiceTbk();
    
    InitMpeTbkVO initVo=new InitMpeTbkVO();
    initVo.setAmount(Integer.parseInt(totalTurismo.toBigInteger().toString()));
    initVo.setBuyOrder(idTransaccion);
    initVo.setIdSession(session.getId());
    initVo.setUrlFinal("http://127.0.0.1:7101/AppDetalleCliente-ViewController-context-root/faces/paginaCliente.jspx");
    initVo.setUrlReturn(url);
    System.out.println(url);
    System.out.println(rut);
     
    InitVO initV=mpeServiceTbk.InitService(initVo);
    session.setAttribute("tokentbk", initV.getToken());
    session.setAttribute("idTransaccion",idTransaccion);
    
    String webBanco=initV.getUrl()+"?token_ws="+initV.getToken(); 
    System.out.println(webBanco);
    String  function="window.open('"+webBanco+"','_blank');";
    CCLAUtils.callGenericJsFunction(function);
     }
 
    public void initialPago() throws IOException {
        System.out.println("##########################################  initialPago()   ##########################################");
    //  usuario = new CCLAUserBean();
selectedListTurismo =
    new ArrayList<CCLAPagoTurismo>();
    
        ExternalContext exctx = FacesContext.getCurrentInstance().getExternalContext();
       
        digitoVerificador = "";
        HttpServletRequest request = (HttpServletRequest) (FacesContext.getCurrentInstance().getExternalContext().getRequest());
        HttpSession session= (HttpSession) (FacesContext.getCurrentInstance().getExternalContext().getSession(true));

        if (null!=request.getParameter("action")) {
            System.out.println(request.getParameter("action"));
            
            if (request.getParameter("action").equals("webpayNormalGetResult")) {
                 CCLAPagoTbk cclaPagoTbk=new CCLAPagoTbk();
                 cclaPagoTbk.webpayNormalGetResult(request, session);
                  //  InitVO initV=mpeServiceTbk.(initVo);
             }
        }
       System.out.println("inicio");
   //   CCLAUserInfoService userInfo =
   //   (CCLAUserInfoService)exctx.getSessionMap().get("UserInfoMB");
   //   if (userInfo != null && userInfo.getUser() != null) {
   //   usuario = userInfo.getUser();
   //   }
        
        
        try {
        
        /*    if (usuario != null) {
                String rutStr =
                    usuario.getRut().isEmpty() ? CCLAUserInfoUtils.getRut() :
                    usuario.getRut();
                digitoVerificador =
                        usuario.getDv().isEmpty() ? CCLAUserInfoUtils.getDigitoVerificador() :
                        usuario.getDv();
                rut = new BigInteger(rutStr);
                digitoVerificador = usuario.getDv();
*/ 
            //16071760;
            //14521786-
        rut = new BigInteger("12232272");
            
            try {
                llenarlistaTurismo(rut.toString());
            }
            catch (Exception e){
                    logger.info("El cliente no tiene Reservas para pagar");
                    mensaje="No tienes Reservas para pagar";
                    botonPago=true;
                }
            
       //  llenarlistaTurismo(rut.toString());
               mensaje="";
        //     llenarlistaTurismo(rut);
               boolean cajaOk=true;
              
       
            if (listaHistorialTurismo.size()<1) {
                  botonPago=true;
                 mensaje = (String)ADFUtils.evaluateEL("#{applicationScope.handleLabelBean.values['MpeTurismoResultadoDatos']}");
              }
            else
            {
                  ValidaCaja valida=new ValidaCaja();
                  CajaBean caja=valida.validaCaja("WEBPAY2");
          
            if ( caja.getStatus().equals("NOOKSERV")) {
              cajaOk=false;
                        botonPago=true;
                     mensaje = "En Estos Momentos no Podemos Atenderle"; //(String)ADFUtils.evaluateEL("#{applicationScope.handleLabelBean.values['MpeTurismoCajaActivas']}");
                    }
          
                   if( caja.getStatus().equals("NOOK")) {
                                   mensaje = (String)ADFUtils.evaluateEL("#{applicationScope.handleLabelBean.values['MpeTurismoCajaHorario']}")+"Desde "+caja.getHoraInicio()+ " hasta "+caja.getHoraFin();
                         botonPago=true;
                         cajaOk=false;
                     }
            
            }
            
          logger.info("rut de usuario ----->" + rut + "-" +
                     digitoVerificador);
          
        } catch (Exception e) {
            logger.severe(e.getMessage());
          }
    }
    
    public void CargaPopUp(ActionEvent valueChangeEvent) {
        popupDetalle = new CCLACuotaTurismo();
       for (CCLACuotaTurismo item: listaTurismoT) {
         
            if (item.getCodigoReserva() == codReservaPopup) {
                popupDetalle.setNroReserva(item.getCodigoReserva());
                popupDetalle.setEstado(item.getEstado());
                popupDetalle.setCheckIn(item.getCheckIn());
                popupDetalle.setCheckOut(item.getCheckOut());
                popupDetalle.setEstadoCi(item.getEstadoCi());
                popupDetalle.setFechaVencimiento(item.getFechaVencimiento());
                //String string = item.getCentro().toString();
                popupDetalle.setIdCuota(item.getIdCuota());
                popupDetalle.setMontoCi(item.getMontoCi());
                popupDetalle.setNroHabitacion(item.getNroHabitacion());
                popupDetalle.setNumeroComprobante(item.getNumeroComprobante());
                popupDetalle.setTipoHabitacion(item.getTipoHabitacion());
                popupDetalle.setCentro(item.getCentro());
                popupDetalle.setEstado(item.getEstado());
            }
        }
   }

    public String getMetodoPrueba() {
        return null;
    }
    public void setListaHistorialTurismo(List<CCLAPagoTurismo> listaHistorialTurismo) {
        this.listaHistorialTurismo = listaHistorialTurismo;
    }

    public List<CCLAPagoTurismo> getListaHistorialTurismo() {
        return listaHistorialTurismo;
    }

    public void setCodReservaSeleccionado(String codReservaSeleccionado) {
        this.codReservaSeleccionado = codReservaSeleccionado;
    }

    public String getCodReservaSeleccionado() {
        return codReservaSeleccionado;
    }

    public void setListaTurismoT(List<CCLACuotaTurismo> listaTurismoT) {
        this.listaTurismoT = listaTurismoT;
    }

    public List<CCLACuotaTurismo> getListaTurismoT() {
        return listaTurismoT;
    }

    public void setNroComprobanteSeleccionado(String nroComprobanteSeleccionado) {
        this.nroComprobanteSeleccionado = nroComprobanteSeleccionado;
    }

    public String getNroComprobanteSeleccionado() {
        return nroComprobanteSeleccionado;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }
    
    public void setSelectAll(boolean selectAll) {
        this.selectAll = selectAll;
    }

    public boolean isSelectAll() {
        return selectAll;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setRut(BigInteger rut) {
        this.rut = rut;
    }

    public BigInteger getRut() {
        return rut;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public static ADFLogger getLogger() {
        return logger;
    }

   

    public void setSelectedListTurismo(ArrayList<CCLAPagoTurismo> selectedListTurismo) {
        this.selectedListTurismo = selectedListTurismo;
    }

    public ArrayList<CCLAPagoTurismo> getSelectedListTurismo() {
        return selectedListTurismo;
    }

    public void setRutPrueba(String rutPrueba) {
        this.rutPrueba = rutPrueba;
    }

    public String getRutPrueba() {
        return rutPrueba;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setCodReservaPopup(String codReservaPopup) {
        this.codReservaPopup = codReservaPopup;
    }

    public String getCodReservaPopup() {
        return codReservaPopup;
    }

// DESDE AQUI LOS ACCESOS PARA LA PROPIEDADES DEL POPUP

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

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
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

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setEstadoCi(String estadoCi) {
        this.estadoCi = estadoCi;
    }

    public String getEstadoCi() {
        return estadoCi;
    }

    public void setMontoCi(String montoCi) {
        this.montoCi = montoCi;
    }

    public String getMontoCi() {
        return montoCi;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getCuota() {
        return cuota;
    }

    public void setIdCuota(String idCuota) {
        this.idCuota = idCuota;
    }

    public String getIdCuota() {
        return idCuota;
    }

    public void setTotalTurismo(BigDecimal totalTurismo) {
        this.totalTurismo = totalTurismo;
    }

    public BigDecimal getTotalTurismo() {
        return totalTurismo;
    }

    public void setBotonPago(boolean botonPago) {
        this.botonPago = botonPago;
    }

    public boolean isBotonPago() {
        return botonPago;
    }

    public void setPopupDetalle(CCLACuotaTurismo popupDetalle) {
        this.popupDetalle = popupDetalle;
    }

    public CCLACuotaTurismo getPopupDetalle() {
        return popupDetalle;
    }
}
