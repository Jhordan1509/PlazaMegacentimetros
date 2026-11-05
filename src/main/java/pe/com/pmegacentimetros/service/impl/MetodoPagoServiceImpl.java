package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.MetodoPagoEntity;
import pe.com.pmegacentimetros.repository.MetodoPagoRepository;
import pe.com.pmegacentimetros.service.MetodoPagoService;

@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

	private final MetodoPagoRepository repositorio;

	MetodoPagoServiceImpl(MetodoPagoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MetodoPagoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MetodoPagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MetodoPagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MetodoPagoEntity add(MetodoPagoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public MetodoPagoEntity update(MetodoPagoEntity obj, Long id) {
		MetodoPagoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public MetodoPagoEntity delete(Long id) {
		MetodoPagoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public MetodoPagoEntity enable(Long id) {
		MetodoPagoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
