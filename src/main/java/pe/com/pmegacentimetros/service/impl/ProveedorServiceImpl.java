package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ProveedorEntity;
import pe.com.pmegacentimetros.repository.ProveedorRepository;
import pe.com.pmegacentimetros.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	private final ProveedorRepository repositorio;

	ProveedorServiceImpl(ProveedorRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ProveedorEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ProveedorEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ProveedorEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ProveedorEntity add(ProveedorEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ProveedorEntity update(ProveedorEntity obj, Long id) {
		ProveedorEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ProveedorEntity delete(Long id) {
		ProveedorEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ProveedorEntity enable(Long id) {
		ProveedorEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
