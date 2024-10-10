package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talenttune.entities.UsuarioBanda;

@Repository
public interface IUsuarioBandaRepository extends JpaRepository<UsuarioBanda, Integer>{

}
