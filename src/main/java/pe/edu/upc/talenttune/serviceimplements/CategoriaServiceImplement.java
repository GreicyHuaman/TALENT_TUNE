package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.Categoria;
import pe.edu.upc.talenttune.repositories.ICategoriaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public void update(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Categoria findById(int id) {
        return cR.findById(id).orElse(new Categoria());
    }
}
