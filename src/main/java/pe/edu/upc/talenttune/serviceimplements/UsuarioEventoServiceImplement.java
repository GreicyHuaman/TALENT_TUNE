package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.UsuarioEvento;
import pe.edu.upc.talenttune.repositories.IUsuarioEventoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioEventoService;

import java.util.List;

@Service
public class UsuarioEventoServiceImplement implements IUsuarioEventoService {
    @Autowired
    private IUsuarioEventoRepository uER;


    @Override
    public List<UsuarioEvento> list() {
        return uER.findAll();
    }

    @Override
    public void insert(UsuarioEvento usuarioEvento) {
        uER.save(usuarioEvento);
    }

    @Override
    public void update(UsuarioEvento usuarioEvento) {
        uER.save(usuarioEvento);
    }

    @Override
    public void delete(int id) {
        uER.deleteById(id);
    }

    @Override
    public UsuarioEvento findById(int id) {
        return uER.findById(id).orElse(new UsuarioEvento());
    }
}
