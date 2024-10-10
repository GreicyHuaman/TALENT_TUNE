package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.UsuarioEvento;

import java.util.List;

public interface IUsuarioEventoService {
    public List<UsuarioEvento> list();

    public void insert(UsuarioEvento usuarioEvento);

    public void update(UsuarioEvento usuarioEvento);

    public void delete(int id);

    public UsuarioEvento findById(int id);
}
