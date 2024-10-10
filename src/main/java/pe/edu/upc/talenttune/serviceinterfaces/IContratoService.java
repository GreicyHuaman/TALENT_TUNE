package pe.edu.upc.talenttune.serviceinterfaces;

import pe.edu.upc.talenttune.entities.Contrato;

import java.util.List;

public interface IContratoService {
    public List<Contrato> list();

    public void insert(Contrato contrato);

    public void update(Contrato contrato);

    public void delete(int id);

    public Contrato findById(int id);
}
