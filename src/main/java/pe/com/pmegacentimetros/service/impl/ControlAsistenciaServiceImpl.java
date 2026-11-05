package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ControlAsistenciaEntity;
import pe.com.pmegacentimetros.repository.ControlAsistenciaRepository;
import pe.com.pmegacentimetros.service.ControlAsistenciaService;

@Service
public class ControlAsistenciaServiceImpl implements ControlAsistenciaService {

	private final ControlAsistenciaRepository repositorio;

	ControlAsistenciaServiceImpl(ControlAsistenciaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ControlAsistenciaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ControlAsistenciaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ControlAsistenciaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ControlAsistenciaEntity add(ControlAsistenciaEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ControlAsistenciaEntity update(ControlAsistenciaEntity obj, Long id) {
		ControlAsistenciaEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ControlAsistenciaEntity delete(Long id) {
		ControlAsistenciaEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ControlAsistenciaEntity enable(Long id) {
		ControlAsistenciaEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
