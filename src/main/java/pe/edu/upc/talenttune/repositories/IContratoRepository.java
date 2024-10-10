package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talenttune.entities.Contrato;

@Repository
public interface IContratoRepository extends JpaRepository<Contrato, Integer> {

}
