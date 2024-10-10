package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Contenido;

import java.util.List;

public interface IContenidoService {
    public List<Contenido> list();

    public void insert(Contenido contenido);

    public void update(Contenido contenido);

    public void delete(int id);

    public Contenido findById(int id);
}
