package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> list();

    public void insert(Categoria categoria);

    public void update(Categoria categoria);

    public void delete(int id);

    public Categoria findById(int id);
}
