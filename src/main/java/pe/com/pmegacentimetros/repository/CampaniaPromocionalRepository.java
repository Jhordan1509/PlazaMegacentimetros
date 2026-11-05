package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.CampaniaPromocionalEntity;

public interface CampaniaPromocionalRepository extends JpaRepository<CampaniaPromocionalEntity, Long> {

	@Query("select x from CampaniaPromocionalEntity x where x.estado=true")
	List<CampaniaPromocionalEntity> findAllCustom();
}
