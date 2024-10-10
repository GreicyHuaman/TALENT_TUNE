package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Mensaje;

import java.util.List;

public interface IMensajeService {
    public List<Mensaje> list();

    public void insert(Mensaje mensaje);

    public void update(Mensaje mensaje);

    public void delete(int id);

    public Mensaje findById(int id);
}
