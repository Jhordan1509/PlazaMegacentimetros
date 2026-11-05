package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {

	@Query("select x from DistritoEntity x where x.estado=true")
	List<DistritoEntity> findAllCustom();
}
