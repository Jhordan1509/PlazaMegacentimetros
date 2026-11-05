package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.SucursalEntity;
import pe.com.pmegacentimetros.repository.SucursalRepository;
import pe.com.pmegacentimetros.service.SucursalService;

@Service
public class SucursalServiceImpl implements SucursalService {

	private final SucursalRepository repositorio;

	SucursalServiceImpl(SucursalRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<SucursalEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<SucursalEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public SucursalEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public SucursalEntity add(SucursalEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public SucursalEntity update(SucursalEntity obj, Long id) {
		SucursalEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public SucursalEntity delete(Long id) {
		SucursalEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public SucursalEntity enable(Long id) {
		SucursalEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
