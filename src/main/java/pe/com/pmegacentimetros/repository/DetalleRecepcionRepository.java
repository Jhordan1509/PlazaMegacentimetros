package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.DetalleRecepcionEntity;

public interface DetalleRecepcionRepository extends JpaRepository<DetalleRecepcionEntity, Long> {

	@Query("select x from DetalleRecepcionEntity x where x.estado=true")
	List<DetalleRecepcionEntity> findAllCustom();
}
