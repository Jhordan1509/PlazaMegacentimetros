package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.AlmacenEntity;

public interface AlmacenRepository extends JpaRepository<AlmacenEntity, Long> {

	@Query("select x from AlmacenEntity x where x.estado=true")
	List<AlmacenEntity> findAllCustom();
}
