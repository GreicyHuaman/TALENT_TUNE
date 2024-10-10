package pe.edu.upc.talenttune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talenttune.repositories.IRolRepository;
import pe.edu.upc.talenttune.serviceinterfaces.IRolService;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;

}
