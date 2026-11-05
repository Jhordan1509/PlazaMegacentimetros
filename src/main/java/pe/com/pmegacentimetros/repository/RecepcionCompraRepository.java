package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.RecepcionCompraEntity;

public interface RecepcionCompraRepository extends JpaRepository<RecepcionCompraEntity, Long> {

	@Query("select x from RecepcionCompraEntity x where x.estado=true")
	List<RecepcionCompraEntity> findAllCustom();
}
