package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.UsuarioBanda;
import pe.edu.upc.talenttune.repositories.IUsuarioBandaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioBandaService;

import java.util.List;

@Service
public class UsuarioBandaServiceImplement implements IUsuarioBandaService {
    @Autowired
    private IUsuarioBandaRepository uBR;

    @Override
    public List<UsuarioBanda> list() {
        return uBR.findAll();
    }

    @Override
    public void insert(UsuarioBanda usuarioBanda) {
        uBR.save(usuarioBanda);
    }

    @Override
    public void update(UsuarioBanda usuarioBanda) {
        uBR.save(usuarioBanda);
    }

    @Override
    public void delete(int id) {
        uBR.deleteById(id);
    }

    @Override
    public UsuarioBanda findById(int id) {
        return uBR.findById(id).orElse(new UsuarioBanda());
    }
}
