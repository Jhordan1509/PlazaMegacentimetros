package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.SexoEntity;

public interface SexoRepository extends JpaRepository<SexoEntity, Long> {

	@Query("select x from SexoEntity x where x.estado=true")
	List<SexoEntity> findAllCustom();
}
