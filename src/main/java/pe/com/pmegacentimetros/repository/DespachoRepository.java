package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.DespachoEntity;

public interface DespachoRepository extends JpaRepository<DespachoEntity, Long> {

	@Query("select x from DespachoEntity x where x.estado=true")
	List<DespachoEntity> findAllCustom();
}
