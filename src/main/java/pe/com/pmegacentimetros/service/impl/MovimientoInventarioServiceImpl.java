package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.MovimientoInventarioEntity;
import pe.com.pmegacentimetros.repository.MovimientoInventarioRepository;
import pe.com.pmegacentimetros.service.MovimientoInventarioService;

@Service
public class MovimientoInventarioServiceImpl implements MovimientoInventarioService {

	private final MovimientoInventarioRepository repositorio;

	MovimientoInventarioServiceImpl(MovimientoInventarioRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MovimientoInventarioEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MovimientoInventarioEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MovimientoInventarioEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MovimientoInventarioEntity add(MovimientoInventarioEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public MovimientoInventarioEntity update(MovimientoInventarioEntity obj, Long id) {
		MovimientoInventarioEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public MovimientoInventarioEntity delete(Long id) {
		MovimientoInventarioEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public MovimientoInventarioEntity enable(Long id) {
		MovimientoInventarioEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
