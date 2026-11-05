package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.CategoriaProductoEntity;

public interface CategoriaProductoRepository extends JpaRepository<CategoriaProductoEntity, Long> {

	@Query("select x from CategoriaProductoEntity x where x.estado=true")
	List<CategoriaProductoEntity> findAllCustom();
}
