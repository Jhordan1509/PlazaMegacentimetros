package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.TipoClienteEntity;
import pe.com.pmegacentimetros.repository.TipoClienteRepository;
import pe.com.pmegacentimetros.service.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

	private final TipoClienteRepository repositorio;

	TipoClienteServiceImpl(TipoClienteRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<TipoClienteEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<TipoClienteEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public TipoClienteEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public TipoClienteEntity add(TipoClienteEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public TipoClienteEntity update(TipoClienteEntity obj, Long id) {
		TipoClienteEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public TipoClienteEntity delete(Long id) {
		TipoClienteEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public TipoClienteEntity enable(Long id) {
		TipoClienteEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
