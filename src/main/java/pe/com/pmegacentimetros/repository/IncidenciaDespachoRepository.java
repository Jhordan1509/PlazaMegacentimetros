package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.IncidenciaDespachoEntity;

public interface IncidenciaDespachoRepository extends JpaRepository<IncidenciaDespachoEntity, Long> {

	@Query("select x from IncidenciaDespachoEntity x where x.estado=true")
	List<IncidenciaDespachoEntity> findAllCustom();
}
