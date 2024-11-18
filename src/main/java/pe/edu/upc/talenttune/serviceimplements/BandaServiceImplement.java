package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.Banda;
import pe.edu.upc.talenttune.repositories.IBandaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IBandaService;

import java.util.List;

@Service
public class BandaServiceImplement implements IBandaService {
    @Autowired
    private IBandaRepository bR;

    @Override
    public List<Banda> list() {
        return bR.findAll();
    }

    @Override
    public void insert(Banda banda) {
        bR.save(banda);
    }

    @Override
    public void update(Banda banda) {
        bR.save(banda);
    }

    @Override
    public void delete(int id) {
        bR.deleteById(id);
    }

    @Override
    public Banda findById(int id) {
        return bR.findById(id).orElse(new Banda());
    }

    @Override
    public List<String[]> BandasMasContratosActivos() {
        return bR.BandasMasContratosActivos();
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return bR.existsByNombre(nombre);
    }

}
