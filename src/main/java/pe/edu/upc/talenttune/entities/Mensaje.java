package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Mensaje")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;
    @Column(name = "contenido", nullable = false, length = 200)
    private String contenido;
    @Column(name = "fechaEnvio", nullable = false)
    private LocalDate fechaEnvio;

    @ManyToOne
    @JoinColumn(name = "idUsuarioManager")
    private Usuario idUsuarioManager;

    @ManyToOne
    @JoinColumn(name = "idUsuarioTalento")
    private Usuario idUsuarioTalento;

    @ManyToOne
    @JoinColumn(name = "idBanda")
    private Banda banda;

    public Mensaje() {
    }

    public Mensaje(int idMensaje, String contenido, LocalDate fechaEnvio, Usuario idUsuarioManager, Usuario idUsuarioTalento, Banda banda) {
        this.idMensaje = idMensaje;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.idUsuarioManager = idUsuarioManager;
        this.idUsuarioTalento = idUsuarioTalento;
        this.banda = banda;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Usuario getIdUsuarioManager() {
        return idUsuarioManager;
    }

    public void setIdUsuarioManager(Usuario idUsuarioManager) {
        this.idUsuarioManager = idUsuarioManager;
    }

    public Usuario getIdUsuarioTalento() {
        return idUsuarioTalento;
    }

    public void setIdUsuarioTalento(Usuario idUsuarioTalento) {
        this.idUsuarioTalento = idUsuarioTalento;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
