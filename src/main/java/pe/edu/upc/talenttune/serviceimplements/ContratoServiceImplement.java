package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.ICategoriaRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IContratoService;

@Service
public class ContratoServiceImplement implements IContratoService {
    @Autowired
    private ICategoriaRepository conR;

}
