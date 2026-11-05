package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.CapacitacionPersonalEntity;

public interface CapacitacionPersonalRepository extends JpaRepository<CapacitacionPersonalEntity, Long> {

	@Query("select x from CapacitacionPersonalEntity x where x.estado=true")
	List<CapacitacionPersonalEntity> findAllCustom();
}
