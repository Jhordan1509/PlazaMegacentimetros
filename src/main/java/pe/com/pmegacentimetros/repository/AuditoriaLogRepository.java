package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.AuditoriaLogEntity;

public interface AuditoriaLogRepository extends JpaRepository<AuditoriaLogEntity, Long> {

	@Query("select x from AuditoriaLogEntity x where x.estado=true")
	List<AuditoriaLogEntity> findAllCustom();
}
