package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();

    public void insert(Usuario usuario);

    public void update(Usuario usuario);

    public void delete(int id);

    public Usuario findById(int id);

    public int findLastUserRegister();

    public List<String[]> edadPromedioTalento();
}
