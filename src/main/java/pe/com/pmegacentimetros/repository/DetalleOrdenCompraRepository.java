package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.DetalleOrdenCompraEntity;

public interface DetalleOrdenCompraRepository extends JpaRepository<DetalleOrdenCompraEntity, Long> {

	@Query("select x from DetalleOrdenCompraEntity x where x.estado=true")
	List<DetalleOrdenCompraEntity> findAllCustom();
}
