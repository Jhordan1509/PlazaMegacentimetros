package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

	@Query("select x from ProductoEntity x where x.estado=true")
	List<ProductoEntity> findAllCustom();
}
