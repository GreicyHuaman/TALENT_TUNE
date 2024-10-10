package pe.edu.upc.talenttune.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "tipoCategoria", nullable = false, length = 40)
    private String tipoCategoria;

    public Categoria() {
    }

    public Categoria(int idCategoria, String tipoCategoria) {
        this.idCategoria = idCategoria;
        this.tipoCategoria = tipoCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}
