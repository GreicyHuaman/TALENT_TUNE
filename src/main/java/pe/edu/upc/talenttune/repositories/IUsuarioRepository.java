package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.talenttune.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String username);

    @Query(value = "SELECT ROUND(AVG(EXTRACT(YEAR FROM AGE(u.fecha_nacimiento)))) AS edad_promedio\n" +
            "FROM usuario u\n" +
            "JOIN roles r ON u.id_usuario = r.id_usuario\n" +
            "WHERE r.tipo_rol = 'TALENTO'",nativeQuery = true)
    public List<String[]> edadPromedioTalento();

    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into Roles (rol, idUsuario) VALUES (:rol, :idUsuario)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("idUsuario") int idUsuario);

}
