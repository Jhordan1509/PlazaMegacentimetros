package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.StockAlmacenEntity;

public interface StockAlmacenRepository extends JpaRepository<StockAlmacenEntity, Long> {

	@Query("select x from StockAlmacenEntity x where x.estado=true")
	List<StockAlmacenEntity> findAllCustom();
}
