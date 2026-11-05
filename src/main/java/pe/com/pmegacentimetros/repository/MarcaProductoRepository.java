package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.MarcaProductoEntity;

public interface MarcaProductoRepository extends JpaRepository<MarcaProductoEntity, Long> {

	@Query("select x from MarcaProductoEntity x where x.estado=true")
	List<MarcaProductoEntity> findAllCustom();
}
