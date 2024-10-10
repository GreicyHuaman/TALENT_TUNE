package pe.edu.upc.talenttune.dtos;

import pe.edu.upc.talenttune.entities.Evento;

public class NotificacionDTO {
    private int idNotificacion;
    private String detalle;
    private Evento evento;

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
