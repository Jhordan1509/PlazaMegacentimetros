package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.TipoDocumentoEntity;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {

	@Query("select x from TipoDocumentoEntity x where x.estado=true")
	List<TipoDocumentoEntity> findAllCustom();
}
