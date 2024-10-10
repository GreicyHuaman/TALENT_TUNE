package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.UsuarioBanda;

import java.util.List;

public interface IUsuarioBandaService {
    public List<UsuarioBanda> list();

    public void insert(UsuarioBanda usuarioBanda);

    public void update(UsuarioBanda usuarioBanda);

    public void delete(int id);

    public UsuarioBanda findById(int id);
}
