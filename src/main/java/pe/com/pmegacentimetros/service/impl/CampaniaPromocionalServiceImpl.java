package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.CampaniaPromocionalEntity;
import pe.com.pmegacentimetros.repository.CampaniaPromocionalRepository;
import pe.com.pmegacentimetros.service.CampaniaPromocionalService;

@Service
public class CampaniaPromocionalServiceImpl implements CampaniaPromocionalService {

	private final CampaniaPromocionalRepository repositorio;

	CampaniaPromocionalServiceImpl(CampaniaPromocionalRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<CampaniaPromocionalEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<CampaniaPromocionalEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public CampaniaPromocionalEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CampaniaPromocionalEntity add(CampaniaPromocionalEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public CampaniaPromocionalEntity update(CampaniaPromocionalEntity obj, Long id) {
		CampaniaPromocionalEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public CampaniaPromocionalEntity delete(Long id) {
		CampaniaPromocionalEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public CampaniaPromocionalEntity enable(Long id) {
		CampaniaPromocionalEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
