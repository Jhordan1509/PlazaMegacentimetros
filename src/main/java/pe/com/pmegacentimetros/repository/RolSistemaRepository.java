package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.RolSistemaEntity;

public interface RolSistemaRepository extends JpaRepository<RolSistemaEntity, Long> {

	@Query("select x from RolSistemaEntity x where x.estado=true")
	List<RolSistemaEntity> findAllCustom();
}
