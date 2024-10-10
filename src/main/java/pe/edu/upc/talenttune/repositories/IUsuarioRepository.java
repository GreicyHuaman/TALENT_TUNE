package pe.edu.upc.talenttune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.talenttune.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername (String username);

    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into Roles (rol, idUsuario) VALUES (:rol, :idUsuario)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("idUsuario") int idUsuario);

}
