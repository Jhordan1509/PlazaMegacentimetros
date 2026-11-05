package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.TipoEmpaqueEntity;
import pe.com.pmegacentimetros.repository.TipoEmpaqueRepository;
import pe.com.pmegacentimetros.service.TipoEmpaqueService;

@Service
public class TipoEmpaqueServiceImpl implements TipoEmpaqueService {

	private final TipoEmpaqueRepository repositorio;

	TipoEmpaqueServiceImpl(TipoEmpaqueRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<TipoEmpaqueEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<TipoEmpaqueEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public TipoEmpaqueEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public TipoEmpaqueEntity add(TipoEmpaqueEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public TipoEmpaqueEntity update(TipoEmpaqueEntity obj, Long id) {
		TipoEmpaqueEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public TipoEmpaqueEntity delete(Long id) {
		TipoEmpaqueEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public TipoEmpaqueEntity enable(Long id) {
		TipoEmpaqueEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
