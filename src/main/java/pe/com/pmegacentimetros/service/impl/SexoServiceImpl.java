package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.SexoEntity;
import pe.com.pmegacentimetros.repository.SexoRepository;
import pe.com.pmegacentimetros.service.SexoService;

@Service
public class SexoServiceImpl implements SexoService {

	private final SexoRepository repositorio;

	SexoServiceImpl(SexoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<SexoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<SexoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public SexoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public SexoEntity add(SexoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public SexoEntity update(SexoEntity obj, Long id) {
		SexoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public SexoEntity delete(Long id) {
		SexoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public SexoEntity enable(Long id) {
		SexoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
