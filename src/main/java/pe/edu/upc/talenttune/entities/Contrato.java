package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;
    @Column(name = "salario", nullable = false)
    private double salario;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "condiciones", nullable = false, length = 300)
    private String condiciones;

    @ManyToOne
    @JoinColumn(name = "idUsuarioManager", nullable = false)
    private Usuario idUsuarioManager;

    @ManyToOne
    @JoinColumn(name = "idUsuarioTalento", nullable = true)
    private Usuario idUsuarioTalento;

    @ManyToOne
    @JoinColumn(name = "idBanda", nullable = true)
    private Banda banda;

    public Contrato() {
    }

    public Contrato(int idContrato, LocalDate fechaInicio, LocalDate fechaFin, double salario, String estado, String condiciones, Usuario idUsuarioManager, Usuario idUsuarioTalento, Banda banda) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.salario = salario;
        this.estado = estado;
        this.condiciones = condiciones;
        this.idUsuarioManager = idUsuarioManager;
        this.idUsuarioTalento = idUsuarioTalento;
        this.banda = banda;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
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
