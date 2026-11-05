package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.AlmacenEntity;
import pe.com.pmegacentimetros.repository.AlmacenRepository;
import pe.com.pmegacentimetros.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService {

	private final AlmacenRepository repositorio;

	AlmacenServiceImpl(AlmacenRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<AlmacenEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<AlmacenEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public AlmacenEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public AlmacenEntity add(AlmacenEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public AlmacenEntity update(AlmacenEntity obj, Long id) {
		AlmacenEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public AlmacenEntity delete(Long id) {
		AlmacenEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public AlmacenEntity enable(Long id) {
		AlmacenEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
