package cl.com.ccla.dashboardnotif;

public class Respuesta {
    
    private Status Status;
    private int estadoOperacion;
    private String descOperacion;
    
    public Respuesta() {
        super();
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public String getDescOperacion() {
        return descOperacion;
    }

    public void setDescOperacion(String descOperacion) {
        this.descOperacion = descOperacion;
    }
}
