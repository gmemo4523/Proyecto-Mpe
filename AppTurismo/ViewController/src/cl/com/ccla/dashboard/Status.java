package cl.com.ccla.dashboard;

public class Status {
    
    private String codigo;

    private String mensaje;

    private String mensajeInterno;

    private String idtrix;

    private String idcli;

    private String urldsh;

    private String data;

    private String firma;
    
    public Status() {
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensajeInterno() {
        return mensajeInterno;
    }

    public void setMensajeInterno(String mensajeInterno) {
        this.mensajeInterno = mensajeInterno;
    }

    public String getIdtrix() {
        return idtrix;
    }

    public void setIdtrix(String idtrix) {
        this.idtrix = idtrix;
    }

    public String getIdcli() {
        return idcli;
    }

    public void setIdcli(String idcli) {
        this.idcli = idcli;
    }

    public String getUrldsh() {
        return urldsh;
    }

    public void setUrldsh(String urldsh) {
        this.urldsh = urldsh;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
