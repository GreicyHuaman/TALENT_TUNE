package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();

    public void insert(Notificacion notificacion);

    public void update(Notificacion notificacion);

    public void delete(int id);

    public Notificacion findById(int id);

}
