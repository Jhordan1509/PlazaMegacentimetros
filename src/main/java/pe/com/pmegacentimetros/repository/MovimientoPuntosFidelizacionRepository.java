package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.MovimientoPuntosFidelizacionEntity;

public interface MovimientoPuntosFidelizacionRepository extends JpaRepository<MovimientoPuntosFidelizacionEntity, Long> {

	@Query("select x from MovimientoPuntosFidelizacionEntity x where x.estado=true")
	List<MovimientoPuntosFidelizacionEntity> findAllCustom();
}
