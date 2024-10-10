package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;
    @Column(name = "tipoContenido", nullable = false, length = 40)
    private String tipoContenido;
    @Column(name = "titulo", length = 40)
    private String titulo;
    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;
    @Column(name = "duracion", nullable = false)
    private int duracion;
    @Column(name = "visualizaciones")
    private int visualizaciones;
    @Column(name = "likes")
    private int likes;
    //añadir comentarios

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria idCategoria;

    public Contenido() {
    }

    public Contenido(int idContenido, String tipoContenido, String titulo, LocalDate fechaPublicacion, int duracion, int visualizaciones, int likes, Usuario usuario, Categoria idCategoria) {
        this.idContenido = idContenido;
        this.tipoContenido = tipoContenido;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.likes = likes;
        this.usuario = usuario;
        this.idCategoria = idCategoria;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
}
