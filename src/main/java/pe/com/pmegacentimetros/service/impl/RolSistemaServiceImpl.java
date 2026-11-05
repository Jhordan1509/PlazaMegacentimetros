package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.RolSistemaEntity;
import pe.com.pmegacentimetros.repository.RolSistemaRepository;
import pe.com.pmegacentimetros.service.RolSistemaService;

@Service
public class RolSistemaServiceImpl implements RolSistemaService {

	private final RolSistemaRepository repositorio;

	RolSistemaServiceImpl(RolSistemaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<RolSistemaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<RolSistemaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public RolSistemaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public RolSistemaEntity add(RolSistemaEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public RolSistemaEntity update(RolSistemaEntity obj, Long id) {
		RolSistemaEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public RolSistemaEntity delete(Long id) {
		RolSistemaEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public RolSistemaEntity enable(Long id) {
		RolSistemaEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
