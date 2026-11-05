package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.MovimientoPuntosFidelizacionEntity;
import pe.com.pmegacentimetros.repository.MovimientoPuntosFidelizacionRepository;
import pe.com.pmegacentimetros.service.MovimientoPuntosFidelizacionService;

@Service
public class MovimientoPuntosFidelizacionServiceImpl implements MovimientoPuntosFidelizacionService {

	private final MovimientoPuntosFidelizacionRepository repositorio;

	MovimientoPuntosFidelizacionServiceImpl(MovimientoPuntosFidelizacionRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MovimientoPuntosFidelizacionEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MovimientoPuntosFidelizacionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MovimientoPuntosFidelizacionEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MovimientoPuntosFidelizacionEntity add(MovimientoPuntosFidelizacionEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public MovimientoPuntosFidelizacionEntity update(MovimientoPuntosFidelizacionEntity obj, Long id) {
		MovimientoPuntosFidelizacionEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public MovimientoPuntosFidelizacionEntity delete(Long id) {
		MovimientoPuntosFidelizacionEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public MovimientoPuntosFidelizacionEntity enable(Long id) {
		MovimientoPuntosFidelizacionEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
