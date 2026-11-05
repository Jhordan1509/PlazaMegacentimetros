package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.PersonalEntity;

public interface PersonalRepository extends JpaRepository<PersonalEntity, Long> {

	@Query("select x from PersonalEntity x where x.estado=true")
	List<PersonalEntity> findAllCustom();
}
