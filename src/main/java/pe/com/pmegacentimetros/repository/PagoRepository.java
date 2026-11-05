package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.PagoEntity;

public interface PagoRepository extends JpaRepository<PagoEntity, Long> {

	@Query("select x from PagoEntity x where x.estado=true")
	List<PagoEntity> findAllCustom();
}
