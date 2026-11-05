package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.DetalleRecepcionEntity;
import pe.com.pmegacentimetros.repository.DetalleRecepcionRepository;
import pe.com.pmegacentimetros.service.DetalleRecepcionService;

@Service
public class DetalleRecepcionServiceImpl implements DetalleRecepcionService {

	private final DetalleRecepcionRepository repositorio;

	DetalleRecepcionServiceImpl(DetalleRecepcionRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<DetalleRecepcionEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DetalleRecepcionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DetalleRecepcionEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DetalleRecepcionEntity add(DetalleRecepcionEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public DetalleRecepcionEntity update(DetalleRecepcionEntity obj, Long id) {
		DetalleRecepcionEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public DetalleRecepcionEntity delete(Long id) {
		DetalleRecepcionEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public DetalleRecepcionEntity enable(Long id) {
		DetalleRecepcionEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
