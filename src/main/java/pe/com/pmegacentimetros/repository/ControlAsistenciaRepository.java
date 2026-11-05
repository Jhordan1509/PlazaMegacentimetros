package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.ControlAsistenciaEntity;

public interface ControlAsistenciaRepository extends JpaRepository<ControlAsistenciaEntity, Long> {

	@Query("select x from ControlAsistenciaEntity x where x.estado=true")
	List<ControlAsistenciaEntity> findAllCustom();
}
