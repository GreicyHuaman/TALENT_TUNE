package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IUsuarioEventoRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IUsuarioEventoService;

@Service
public class UsuarioEventoServiceImplement implements IUsuarioEventoService {
    @Autowired
    private IUsuarioEventoRepository uER;


}
