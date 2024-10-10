package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IEventoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IEventoService;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository eR;

}
