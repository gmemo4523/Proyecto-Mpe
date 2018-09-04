package cl.com.ccla.bean.validacaja;

public class CajaBean {
    public CajaBean() {
        super();
    }
    
    private String horaInicio;
    private String horaFin;
    private String status;


    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
