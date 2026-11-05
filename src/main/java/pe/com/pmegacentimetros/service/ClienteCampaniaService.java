package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.ClienteCampaniaEntity;

public interface ClienteCampaniaService {
	List<ClienteCampaniaEntity> findAll();
	List<ClienteCampaniaEntity> findAllCustom();
	ClienteCampaniaEntity findById(Long id);
	ClienteCampaniaEntity add(ClienteCampaniaEntity obj);
	ClienteCampaniaEntity update(ClienteCampaniaEntity obj, Long id);
	ClienteCampaniaEntity delete(Long id);
	ClienteCampaniaEntity enable(Long id);
}
