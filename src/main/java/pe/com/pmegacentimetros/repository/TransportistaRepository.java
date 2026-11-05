package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.TransportistaEntity;

public interface TransportistaRepository extends JpaRepository<TransportistaEntity, Long> {

	@Query("select x from TransportistaEntity x where x.estado=true")
	List<TransportistaEntity> findAllCustom();
}
