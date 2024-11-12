package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;
    @Column(name = "Contenido", nullable = false, length = 40)
    private String Contenido;
    @Column(name = "titulo", length = 40)
    private String titulo;
    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;
    @Column(name = "likes")
    private boolean likes;

    @ManyToOne
    @JoinColumn(name = "usuario", nullable = true)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria idCategoria;

    @ManyToOne
    @JoinColumn(name = "idBanda", nullable = true)
    private Banda banda;

    public Contenido() {
    }

    public Contenido(int idContenido, String contenido, String titulo, LocalDate fechaPublicacion, boolean likes, Usuario usuario, Categoria idCategoria, Banda banda) {
        this.idContenido = idContenido;
        Contenido = contenido;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.likes = likes;
        this.usuario = usuario;
        this.idCategoria = idCategoria;
        this.banda = banda;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
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

    public boolean isLikes() {
        return likes;
    }

    public void setLikes(boolean likes) {
        this.likes = likes;
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

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
}
