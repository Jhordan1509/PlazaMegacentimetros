package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.MovimientoInventarioEntity;

public interface MovimientoInventarioRepository extends JpaRepository<MovimientoInventarioEntity, Long> {

	@Query("select x from MovimientoInventarioEntity x where x.estado=true")
	List<MovimientoInventarioEntity> findAllCustom();
}
