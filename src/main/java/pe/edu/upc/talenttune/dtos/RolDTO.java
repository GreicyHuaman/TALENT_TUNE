package pe.edu.upc.talenttune.dtos;

import pe.edu.upc.talenttune.entities.Usuario;

public class RolDTO {
    private int idRol;
    private String tipoRol;
    private Usuario usuarios;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }
}