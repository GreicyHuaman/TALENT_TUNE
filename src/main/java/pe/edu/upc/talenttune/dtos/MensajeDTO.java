package pe.edu.upc.talenttune.dtos;

import pe.edu.upc.talenttune.entities.Banda;
import pe.edu.upc.talenttune.entities.Usuario;

import java.time.LocalDate;

public class MensajeDTO {
    private int idMensaje;
    private String contenido;
    private LocalDate fechaEnvio;

    private Usuario idUsuarioManager;
    private Usuario idUsuarioTalento;
    private Banda banda;

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
