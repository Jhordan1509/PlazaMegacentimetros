package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.IncidenciaDespachoEntity;
import pe.com.pmegacentimetros.repository.IncidenciaDespachoRepository;
import pe.com.pmegacentimetros.service.IncidenciaDespachoService;

@Service
public class IncidenciaDespachoServiceImpl implements IncidenciaDespachoService {

	private final IncidenciaDespachoRepository repositorio;

	IncidenciaDespachoServiceImpl(IncidenciaDespachoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<IncidenciaDespachoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<IncidenciaDespachoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public IncidenciaDespachoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public IncidenciaDespachoEntity add(IncidenciaDespachoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public IncidenciaDespachoEntity update(IncidenciaDespachoEntity obj, Long id) {
		IncidenciaDespachoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public IncidenciaDespachoEntity delete(Long id) {
		IncidenciaDespachoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public IncidenciaDespachoEntity enable(Long id) {
		IncidenciaDespachoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
