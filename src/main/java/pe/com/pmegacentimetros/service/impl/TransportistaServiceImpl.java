package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.TransportistaEntity;
import pe.com.pmegacentimetros.repository.TransportistaRepository;
import pe.com.pmegacentimetros.service.TransportistaService;

@Service
public class TransportistaServiceImpl implements TransportistaService {

	private final TransportistaRepository repositorio;

	TransportistaServiceImpl(TransportistaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<TransportistaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<TransportistaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public TransportistaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public TransportistaEntity add(TransportistaEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public TransportistaEntity update(TransportistaEntity obj, Long id) {
		TransportistaEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public TransportistaEntity delete(Long id) {
		TransportistaEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public TransportistaEntity enable(Long id) {
		TransportistaEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
