package cl.beans;

public class DetallePago
{
  private String rut;
  private String nDocumento;
  private String fechaVencimiento;
  private String montoTotal;
  private String estadoTrx;
  private boolean ocultarFila = true;
  private String detallepopup;
  
  public DetallePago(String rut, String nDocumento, String fechaVencimiento, String montoTotal, String estadoTrx, String detallepopup)
  {
    this.rut = rut;
    this.nDocumento = nDocumento;
    this.fechaVencimiento = fechaVencimiento;
    this.montoTotal = montoTotal;
    this.estadoTrx = estadoTrx;
    this.detallepopup = detallepopup;
  }
  
  public String getRut()
  {
    return this.rut;
  }
  
  public void setRut(String rut)
  {
    this.rut = rut;
  }
  
  public String getNDocumento()
  {
    return this.nDocumento;
  }
  
  public void setNDocumento(String nDocumento)
  {
    this.nDocumento = nDocumento;
  }
  
  public String getFechaVencimiento()
  {
    return this.fechaVencimiento;
  }
  
  public void setFechaVencimiento(String fechaVencimiento)
  {
    this.fechaVencimiento = fechaVencimiento;
  }
  
  public String getMontoTotal()
  {
    return this.montoTotal;
  }
  
  public void setMontoTotal(String montoTotal)
  {
    this.montoTotal = montoTotal;
  }
  
  public String getEstadoTrx()
  {
    return this.estadoTrx;
  }
  
  public void setEstadoTrx(String estadoTrx)
  {
    this.estadoTrx = estadoTrx;
  }
  
  public void setOcultarFila(boolean ocultarFila)
  {
    this.ocultarFila = ocultarFila;
  }
  
  public boolean isOcultarFila()
  {
    return this.ocultarFila;
  }
  
  public void setDetallepopup(String detallepopup)
  {
    this.detallepopup = detallepopup;
  }
  
  public String getDetallepopup()
  {
    return this.detallepopup;
  }
}
