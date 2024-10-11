package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "UsuarioBanda")
public class UsuarioBanda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioBanda;
    @Column(name = "fechaIngreso", nullable = false)
    private LocalDate fechaIngreso;
    @Column(name = "fechaSalida")
    private LocalDate fechaSalida;
    @Column(name = "rol", nullable = false, length = 25)
    private String rol;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idBanda")
    private Banda banda;

    public UsuarioBanda() {
    }

    public UsuarioBanda(int idUsuarioBanda, LocalDate fechaIngreso, LocalDate fechaSalida, String rol, Usuario usuario, Banda banda) {
        this.idUsuarioBanda = idUsuarioBanda;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.rol = rol;
        this.usuario = usuario;
        this.banda = banda;
    }

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
