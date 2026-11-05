package pe.com.pmegacentimetros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.pmegacentimetros.entity.ClienteCampaniaEntity;

public interface ClienteCampaniaRepository extends JpaRepository<ClienteCampaniaEntity, Long> {

	@Query("select x from ClienteCampaniaEntity x where x.estado=true")
	List<ClienteCampaniaEntity> findAllCustom();
}
