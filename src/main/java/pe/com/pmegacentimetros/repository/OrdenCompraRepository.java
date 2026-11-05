package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.OrdenCompraEntity;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompraEntity, Long> {

	@Query("select x from OrdenCompraEntity x where x.estado=true")
	List<OrdenCompraEntity> findAllCustom();
}
