package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.UsuarioCredencialEntity;
import pe.com.pmegacentimetros.repository.UsuarioCredencialRepository;
import pe.com.pmegacentimetros.service.UsuarioCredencialService;

@Service
public class UsuarioCredencialServiceImpl implements UsuarioCredencialService {

	private final UsuarioCredencialRepository repositorio;

	UsuarioCredencialServiceImpl(UsuarioCredencialRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<UsuarioCredencialEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<UsuarioCredencialEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public UsuarioCredencialEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public UsuarioCredencialEntity add(UsuarioCredencialEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public UsuarioCredencialEntity update(UsuarioCredencialEntity obj, Long id) {
		UsuarioCredencialEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public UsuarioCredencialEntity delete(Long id) {
		UsuarioCredencialEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public UsuarioCredencialEntity enable(Long id) {
		UsuarioCredencialEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
