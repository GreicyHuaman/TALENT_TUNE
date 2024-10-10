package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.Contrato;
import pe.edu.upc.talenttune.repositories.IContratoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IContratoService;

import java.util.List;

@Service
public class ContratoServiceImplement implements IContratoService {
    @Autowired
    private IContratoRepository conR;

    @Override
    public List<Contrato> list() {
        return conR.findAll();
    }

    @Override
    public void insert(Contrato contrato) {
        conR.save(contrato);
    }

    @Override
    public void update(Contrato contrato) {
        conR.save(contrato);
    }

    @Override
    public void delete(int id) {
        conR.deleteById(id);
    }

    @Override
    public Contrato findById(int id) {
        return conR.findById(id).orElse(new Contrato());
    }

}
