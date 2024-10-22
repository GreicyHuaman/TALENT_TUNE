package pe.edu.upc.talenttune.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    @Column(name = "pais", nullable = false, length = 30)
    private String pais;
    @Column(name = "agencia", length = 50)
    private String agencia;
    @Column(name = "sexo", nullable = false, length = 10)
    private String sexo;
    @Column(name = "estudios", length = 50)
    private String estudios;


    public Usuario() {
    }

    public Usuario(int idUsuario, String nombres, LocalDate fechaNacimiento, String descripcion, String pais, String agencia, String sexo, String estudios) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.descripcion = descripcion;
        this.pais = pais;
        this.agencia = agencia;
        this.sexo = sexo;
        this.estudios = estudios;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
}