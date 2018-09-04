package cl.com.ccla.dashboard;


import java.util.ArrayList;


public class Dash {
    
    private String tipoDetalle;
    private String codigoProducto;
    private long rutPersona;
    private long rutEmpresa;
    private long monto;
    private String usuarioGraba;
    private String urlRetorno;
    private ArrayList<Det> Det;
    private String url;
    
    public Dash() {
        super();
    }

    public String getTipoDetalle() {
        return tipoDetalle;
    }

    public void setTipoDetalle(String tipoDetalle) {
        this.tipoDetalle = tipoDetalle;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public long getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(long rutPersona) {
        this.rutPersona = rutPersona;
    }

    public long getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(long rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getUsuarioGraba() {
        return usuarioGraba;
    }

    public void setUsuarioGraba(String usuarioGraba) {
        this.usuarioGraba = usuarioGraba;
    }

    public String getUrlRetorno() {
        return urlRetorno;
    }

    public void setUrlRetorno(String urlRetorno) {
        this.urlRetorno = urlRetorno;
    }

    public ArrayList<Det> getDetalle() {
        return Det;
    }

    public void setDetalle(ArrayList<Det> Det) {
        this.Det = Det;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
