package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();

    public void insert(Rol rol);

    public void update(Rol rol);

    public void delete(int id);

    public Rol findById(int id);
}