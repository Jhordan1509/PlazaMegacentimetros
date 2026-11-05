package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.CapacitacionPersonalEntity;
import pe.com.pmegacentimetros.repository.CapacitacionPersonalRepository;
import pe.com.pmegacentimetros.service.CapacitacionPersonalService;

@Service
public class CapacitacionPersonalServiceImpl implements CapacitacionPersonalService {

	private final CapacitacionPersonalRepository repositorio;

	CapacitacionPersonalServiceImpl(CapacitacionPersonalRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<CapacitacionPersonalEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<CapacitacionPersonalEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public CapacitacionPersonalEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CapacitacionPersonalEntity add(CapacitacionPersonalEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public CapacitacionPersonalEntity update(CapacitacionPersonalEntity obj, Long id) {
		CapacitacionPersonalEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public CapacitacionPersonalEntity delete(Long id) {
		CapacitacionPersonalEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public CapacitacionPersonalEntity enable(Long id) {
		CapacitacionPersonalEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
