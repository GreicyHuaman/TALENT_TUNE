package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "duracion", nullable = false)
    private int duracion;
    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    public Evento() {
    }

    public Evento(int idEvento, String nombre, LocalDate fecha, String tipo, int duracion, String descripcion, Usuario usuario) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
