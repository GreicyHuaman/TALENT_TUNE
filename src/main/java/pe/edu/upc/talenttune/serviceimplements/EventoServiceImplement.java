package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.entities.Evento;
import pe.edu.upc.talenttune.repositories.IEventoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IEventoService;

import java.util.List;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository eR;

    @Override
    public List<Evento> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Evento evento) {
        eR.save(evento);
    }

    @Override
    public void update(Evento evento) {
        eR.save(evento);
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Evento listById(int id) {
        return eR.findById(id).orElse(new Evento());
    }
}
