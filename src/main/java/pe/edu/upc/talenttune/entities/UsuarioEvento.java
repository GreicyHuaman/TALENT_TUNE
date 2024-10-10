package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UsuarioEvento")
public class UsuarioEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioEvento;
    @Column(name = "interesado", nullable = false)
    private boolean interesado;
    @Column(name = "asistio")
    private boolean asistio;
    @Column(name = "calificacion")
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Evento evento;

    public UsuarioEvento() {
    }

    public UsuarioEvento(int idUsuarioEvento, boolean interesado, boolean asistio, int calificacion, Usuario usuario, Evento evento) {
        this.idUsuarioEvento = idUsuarioEvento;
        this.interesado = interesado;
        this.asistio = asistio;
        this.calificacion = calificacion;
        this.usuario = usuario;
        this.evento = evento;
    }

    public int getIdUsuarioEvento() {
        return idUsuarioEvento;
    }

    public void setIdUsuarioEvento(int idUsuarioEvento) {
        this.idUsuarioEvento = idUsuarioEvento;
    }

    public boolean isInteresado() {
        return interesado;
    }

    public void setInteresado(boolean interesado) {
        this.interesado = interesado;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
