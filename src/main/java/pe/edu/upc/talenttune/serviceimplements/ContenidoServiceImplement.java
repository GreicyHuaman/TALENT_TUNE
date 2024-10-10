package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.Contenido;
import pe.edu.upc.talenttune.repositories.IContenidoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IContenidoService;

import java.util.List;

@Service
public class ContenidoServiceImplement implements IContenidoService {
    @Autowired
    private IContenidoRepository cR;

    @Override
    public List<Contenido> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Contenido contenido) {
        cR.save(contenido);
    }

    @Override
    public void update(Contenido contenido) {
        cR.save(contenido);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Contenido findById(int id) {
        return cR.findById(id).orElse(new Contenido());
    }

}
