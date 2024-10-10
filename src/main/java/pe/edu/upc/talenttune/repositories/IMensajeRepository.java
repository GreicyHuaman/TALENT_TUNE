package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talenttune.entities.Mensaje;

@Repository
public interface IMensajeRepository extends JpaRepository<Mensaje, Integer> {
}
