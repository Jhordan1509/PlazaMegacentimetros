package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.TipoEmpaqueEntity;

public interface TipoEmpaqueRepository extends JpaRepository<TipoEmpaqueEntity, Long> {

	@Query("select x from TipoEmpaqueEntity x where x.estado=true")
	List<TipoEmpaqueEntity> findAllCustom();
}
