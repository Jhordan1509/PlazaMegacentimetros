package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.FacturaProveedorEntity;

public interface FacturaProveedorRepository extends JpaRepository<FacturaProveedorEntity, Long> {

	@Query("select x from FacturaProveedorEntity x where x.estado=true")
	List<FacturaProveedorEntity> findAllCustom();
}
