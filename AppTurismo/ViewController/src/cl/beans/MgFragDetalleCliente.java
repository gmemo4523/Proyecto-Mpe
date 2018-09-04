package cl.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ActionEvent;

public class MgFragDetalleCliente implements Serializable {
    private static final long serialVersionUID = 2L;
    
    private HistorialPagoTurismo hPagoTurismo;
    private DetallePago detallePago;
    private List<DetallePago> listDetallePago;  
    private String rutSelected;
    private String detallepopup;
    
   
    public MgFragDetalleCliente() {
        super();
        intanciaClases();
       
        //MPETransaccionHistorialBean mpe = new MPETransaccionHistorialBean();
        //ArrayList<CCLAHistorialTransaccion> respuesta = mpe.transaccion(new BigInteger("1"), "1");
        //System.out.println(respuesta.size());
        //System.out.println(respuesta.get(0).getCodigoAutorizacion().toString());                                
     
        //este es por el tipo de constructor que crearo, o sirve asi          
 //       this.listDetallePago.add(new DetallePago(  "18.526.917-0","17885357","18/05/2021","$ 325.000","Rechazada/Negada"  )); 
        // o de esta manera
        //detallePago.setRut(respuesta.get(0).getRutPersona().toString());  
        detallePago.setRut("12135003");
        detallePago.setNDocumento("16775249");        
        detallePago.setFechaVencimiento("27/05/2030");
        //detallePago.setMontoTotal(respuesta.get(0).getMonto());
        detallePago.setMontoTotal("65601");
        //detallePago.setEstadoTrx(respuesta.get(0).getStatus()); //detallePago.setEstadoTrx("Aceptado/Autorizada");
        detallePago.setEstadoTrx("ABONADA");
        detallePago.setDetallepopup("detalle1");
               
        listDetallePago.add(detallePago);
        
        DetallePago detallePago1 = new DetallePago("1","2","3","4","5","6"  );
        
        detallePago1.setRut("16414192");
        detallePago1.setNDocumento("16414192");        
        detallePago1.setFechaVencimiento("27/05/2022");
        //detallePago.setMontoTotal(respuesta.get(0).getMonto());
        detallePago1.setMontoTotal("65601");
        //detallePago.setEstadoTrx(respuesta.get(0).getStatus()); //detallePago.setEstadoTrx("Aceptado/Autorizada");
        detallePago1.setEstadoTrx("ABONADA");
        detallePago1.setDetallepopup("detalle2");
        
        listDetallePago.add(detallePago1);
        
      
        this.hPagoTurismo.setCliente("CESAR LUIS YANEZ ZUNIGA");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");    
        //Calendar calendar = respuesta.get(0).getFechaTransaccion();
        //System.out.println(sdf.format(calendar.getTime()));           
        //this.hPagoTurismo.setFechaTransaccion(sdf.format(calendar.getTime()));
        this.hPagoTurismo.setFechaTransaccion("2018-06-01T00:00:00.000-04:00");
//        this.hPagoTurismo.setTipoPago(respuesta.get(0).getCodigoTipoPago());
        this.hPagoTurismo.setTipoPago("A");
//        this.hPagoTurismo.setComprobante(respuesta.get(0).getNumeroComprobante());
        this.hPagoTurismo.setComprobante("20181336063015");
//        this.hPagoTurismo.setNumeroTarjeta(respuesta.get(0).getNumeroTarjeta());
        this.hPagoTurismo.setNumeroTarjeta("23312213");
//        this.hPagoTurismo.setCodAutorizacion(respuesta.get(0).getCodigoAutorizacion());
        this.hPagoTurismo.setCodAutorizacion("111111");
//        this.hPagoTurismo.setMonto(respuesta.get(0).getMonto());
        this.hPagoTurismo.setMonto("151651");
//        this.hPagoTurismo.setRut(respuesta.get(0).getRutPersona().toString());
        this.hPagoTurismo.setRut("164141926");
        this.hPagoTurismo.setHora("11:52:52");
        //this.hPagoTurismo.setUrlComercio(respuesta.get(0).getUrlRedireccion());
        this.hPagoTurismo.setUrlComercio("url:prueba");
        //this.hPagoTurismo.setNuCuotas(respuesta.get(0).getNumeroCuota());
        this.hPagoTurismo.setNuCuotas("2");
        this.hPagoTurismo.setTipoCuota("Sin cuota");
        //this.hPagoTurismo.setOrdenCompra(respuesta.get(0).getOrdenCompra());
        this.hPagoTurismo.setOrdenCompra("898779");
        this.hPagoTurismo.setOrdenTransaccion("2525252525252525252");
         //oculatarLinea();  
    }
    
    private void intanciaClases() {
        this.detallePago = new DetallePago("1","2","3","4","5","6"  );
        this.listDetallePago = new ArrayList <DetallePago>();      
        this.hPagoTurismo = new HistorialPagoTurismo();  
  
    }

// INICIO DE LOS SET Y GET
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    
    public void sethPagoTurismo(HistorialPagoTurismo hPagoTurismo) {
        this.hPagoTurismo = hPagoTurismo;
    }

    public HistorialPagoTurismo gethPagoTurismo() {
        return hPagoTurismo;
    }

    public void setDetallePago(DetallePago detallePago) {
        this.detallePago = detallePago;
    }

    public DetallePago getDetallePago() {
        return detallePago;
    }

    public void setListDetallePago(List<DetallePago> listDetallePago) {
        this.listDetallePago = listDetallePago;
    }

    public List<DetallePago> getListDetallePago() {
        return listDetallePago;
    }
   
 /*    public void setOcultarFila(boolean ocultarFila) {
        this.ocultarFila = ocultarFila;
    }

    public boolean isOcultarFila() {
        return ocultarFila;
    } */


    public void setrutSelected(String rutSelected) {
        this.rutSelected = rutSelected;
    }

    public String getrutSelected() {
        return rutSelected;
    }

    public void setDetallepopup(String detallepopup) {
        this.detallepopup = detallepopup;
    }

    public String getDetallepopup() {
        return detallepopup;
    }



    public void CargaPopUp(ActionEvent valueChangeEvent) {
        System.out.println("RUT: " + rutSelected);
        System.out.println("detalle pago: " + listDetallePago);
        detallepopup = detallePago.getDetallepopup();
        
        
        for (DetallePago item: listDetallePago) {
         
            System.out.println(item);                                
            
            if (item.getRut() == rutSelected) {
                String itemsel = item.getMontoTotal();
                System.out.println(itemsel);
            }
            
        }
        
        
    }

    public String getMetodoPrueba() {
        // Add event code here...
        return null;
    }


}
