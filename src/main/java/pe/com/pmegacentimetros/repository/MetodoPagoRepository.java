package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.MetodoPagoEntity;

public interface MetodoPagoRepository extends JpaRepository<MetodoPagoEntity, Long> {

	@Query("select x from MetodoPagoEntity x where x.estado=true")
	List<MetodoPagoEntity> findAllCustom();
}
