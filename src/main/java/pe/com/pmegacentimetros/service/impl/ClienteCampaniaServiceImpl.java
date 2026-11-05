package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ClienteCampaniaEntity;
import pe.com.pmegacentimetros.repository.ClienteCampaniaRepository;
import pe.com.pmegacentimetros.service.ClienteCampaniaService;

@Service
public class ClienteCampaniaServiceImpl implements ClienteCampaniaService {

	private final ClienteCampaniaRepository repositorio;

	ClienteCampaniaServiceImpl(ClienteCampaniaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ClienteCampaniaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ClienteCampaniaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ClienteCampaniaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ClienteCampaniaEntity add(ClienteCampaniaEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ClienteCampaniaEntity update(ClienteCampaniaEntity obj, Long id) {
		ClienteCampaniaEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ClienteCampaniaEntity delete(Long id) {
		ClienteCampaniaEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ClienteCampaniaEntity enable(Long id) {
		ClienteCampaniaEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
