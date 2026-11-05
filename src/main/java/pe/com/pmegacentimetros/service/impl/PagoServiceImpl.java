package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.PagoEntity;
import pe.com.pmegacentimetros.repository.PagoRepository;
import pe.com.pmegacentimetros.service.PagoService;

@Service
public class PagoServiceImpl implements PagoService {

	private final PagoRepository repositorio;

	PagoServiceImpl(PagoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<PagoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<PagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public PagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PagoEntity add(PagoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public PagoEntity update(PagoEntity obj, Long id) {
		PagoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public PagoEntity delete(Long id) {
		PagoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public PagoEntity enable(Long id) {
		PagoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
