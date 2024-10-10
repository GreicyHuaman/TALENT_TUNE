package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Banda;

import java.util.List;

public interface IBandaService {
    public List<Banda> list();

    public void insert(Banda banda);

    public void update(Banda banda);

    public void delete(int id);

    public Banda findById(int id);
}
