package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.SucursalEntity;

public interface SucursalRepository extends JpaRepository<SucursalEntity, Long> {

	@Query("select x from SucursalEntity x where x.estado=true")
	List<SucursalEntity> findAllCustom();
}
