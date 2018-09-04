package cl.com.ccla.historialpagoturismoagregar;

public class ResponsePago {
    
    private String codigo;
    private String mensaje;
    
    public ResponsePago() {
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
}
