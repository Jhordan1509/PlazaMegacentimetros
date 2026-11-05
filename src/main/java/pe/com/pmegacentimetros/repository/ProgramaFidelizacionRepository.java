package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.ProgramaFidelizacionEntity;

public interface ProgramaFidelizacionRepository extends JpaRepository<ProgramaFidelizacionEntity, Long> {

	@Query("select x from ProgramaFidelizacionEntity x where x.estado=true")
	List<ProgramaFidelizacionEntity> findAllCustom();
}
