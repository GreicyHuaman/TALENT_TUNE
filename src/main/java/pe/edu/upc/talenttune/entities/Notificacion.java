package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;
    @Column(name = "detalle", nullable = false, length = 100)
    private String detalle;

    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Evento evento;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, String detalle, Evento evento) {
        this.idNotificacion = idNotificacion;
        this.detalle = detalle;
        this.evento = evento;
    }

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
