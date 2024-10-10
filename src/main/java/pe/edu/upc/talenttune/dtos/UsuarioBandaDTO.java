package pe.edu.upc.talenttune.dtos;

import pe.edu.upc.talenttune.entities.Banda;
import pe.edu.upc.talenttune.entities.Usuario;

import java.time.LocalDate;

public class UsuarioBandaDTO {
    private int idUsuarioBanda;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private String rol;
    private Usuario usuario;
    private Banda banda;

    public int getIdUsuarioBanda() {
        return idUsuarioBanda;
    }

    public void setIdUsuarioBanda(int idUsuarioBanda) {
        this.idUsuarioBanda = idUsuarioBanda;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
