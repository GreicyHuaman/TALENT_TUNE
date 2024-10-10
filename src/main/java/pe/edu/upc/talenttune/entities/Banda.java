package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Banda")
public class Banda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanda;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    public Banda() {
    }

    public Banda(int idBanda, String nombre, LocalDate fechaCreacion) {
        this.idBanda = idBanda;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(int idBanda) {
        this.idBanda = idBanda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
