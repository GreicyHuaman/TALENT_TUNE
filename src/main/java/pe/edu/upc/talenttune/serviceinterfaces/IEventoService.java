package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Evento;

import java.util.List;

public interface IEventoService {
    public List<Evento> list();

    public void insert(Evento evento);

    public void update(Evento evento);

    public void delete(int id);

    public Evento listById(int id);
}
