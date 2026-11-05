package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.DistritoEntity;
import pe.com.pmegacentimetros.repository.DistritoRepository;
import pe.com.pmegacentimetros.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService {

	private final DistritoRepository repositorio;

	DistritoServiceImpl(DistritoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<DistritoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DistritoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DistritoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DistritoEntity add(DistritoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public DistritoEntity update(DistritoEntity obj, Long id) {
		DistritoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public DistritoEntity delete(Long id) {
		DistritoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public DistritoEntity enable(Long id) {
		DistritoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
