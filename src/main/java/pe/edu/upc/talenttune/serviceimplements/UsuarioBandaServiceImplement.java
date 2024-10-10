package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IUsuarioBandaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioBandaService;

@Service
public class UsuarioBandaServiceImplement implements IUsuarioBandaService {
    @Autowired
    private IUsuarioBandaRepository uBR;

}
