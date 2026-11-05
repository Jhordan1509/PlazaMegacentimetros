package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.PersonalEntity;
import pe.com.pmegacentimetros.repository.PersonalRepository;
import pe.com.pmegacentimetros.service.PersonalService;

@Service
public class PersonalServiceImpl implements PersonalService {

	private final PersonalRepository repositorio;

	PersonalServiceImpl(PersonalRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<PersonalEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<PersonalEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public PersonalEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PersonalEntity add(PersonalEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public PersonalEntity update(PersonalEntity obj, Long id) {
		PersonalEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public PersonalEntity delete(Long id) {
		PersonalEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public PersonalEntity enable(Long id) {
		PersonalEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
