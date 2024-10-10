package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IBandaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IBandaService;

@Service
public class BandaServiceImplement implements IBandaService {
    @Autowired
    private IBandaRepository bR;
}
