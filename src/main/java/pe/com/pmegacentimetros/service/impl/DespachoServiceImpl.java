package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.DespachoEntity;
import pe.com.pmegacentimetros.repository.DespachoRepository;
import pe.com.pmegacentimetros.service.DespachoService;

@Service
public class DespachoServiceImpl implements DespachoService {

	private final DespachoRepository repositorio;

	DespachoServiceImpl(DespachoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<DespachoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DespachoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DespachoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DespachoEntity add(DespachoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public DespachoEntity update(DespachoEntity obj, Long id) {
		DespachoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public DespachoEntity delete(Long id) {
		DespachoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public DespachoEntity enable(Long id) {
		DespachoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
