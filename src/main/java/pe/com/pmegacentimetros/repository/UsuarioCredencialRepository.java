package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.UsuarioCredencialEntity;

public interface UsuarioCredencialRepository extends JpaRepository<UsuarioCredencialEntity, Long> {

	@Query("select x from UsuarioCredencialEntity x where x.estado=true")
	List<UsuarioCredencialEntity> findAllCustom();
}
