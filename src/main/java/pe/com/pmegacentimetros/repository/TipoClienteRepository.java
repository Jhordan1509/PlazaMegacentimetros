package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.TipoClienteEntity;

public interface TipoClienteRepository extends JpaRepository<TipoClienteEntity, Long> {

	@Query("select x from TipoClienteEntity x where x.estado=true")
	List<TipoClienteEntity> findAllCustom();
}
