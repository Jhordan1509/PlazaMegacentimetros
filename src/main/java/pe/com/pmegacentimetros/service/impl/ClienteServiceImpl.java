package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ClienteEntity;
import pe.com.pmegacentimetros.repository.ClienteRepository;
import pe.com.pmegacentimetros.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	private final ClienteRepository repositorio;

	ClienteServiceImpl(ClienteRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ClienteEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ClienteEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ClienteEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ClienteEntity add(ClienteEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ClienteEntity update(ClienteEntity obj, Long id) {
		ClienteEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ClienteEntity delete(Long id) {
		ClienteEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ClienteEntity enable(Long id) {
		ClienteEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
