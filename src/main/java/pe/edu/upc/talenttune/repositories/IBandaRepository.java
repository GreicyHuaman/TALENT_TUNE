package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talenttune.entities.Banda;

import java.util.List;

@Repository
public interface IBandaRepository extends JpaRepository<Banda, Integer> {
    @Query(value = "SELECT b.nombre, COUNT(c.id_contrato) AS contratos_activos\n" +
            " FROM banda b\n" +
            " JOIN contrato c ON b.id_banda = c.id_banda\n" +
            " WHERE c.estado = 'Activo'\n" +
            " GROUP BY b.id_banda, b.nombre\n" +
            " ORDER BY contratos_activos DESC\n" +
            " LIMIT 3;\n",nativeQuery = true)
    List<String[]> BandasMasContratosActivos();

    boolean existsByNombre(String nombre);
}
