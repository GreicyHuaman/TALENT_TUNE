package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IContenidoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IContenidoService;

@Service
public class ContenidoServiceImplement implements IContenidoService {
    @Autowired
    private IContenidoRepository cR;

}
