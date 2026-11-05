package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ProgramaFidelizacionEntity;
import pe.com.pmegacentimetros.repository.ProgramaFidelizacionRepository;
import pe.com.pmegacentimetros.service.ProgramaFidelizacionService;

@Service
public class ProgramaFidelizacionServiceImpl implements ProgramaFidelizacionService {

	private final ProgramaFidelizacionRepository repositorio;

	ProgramaFidelizacionServiceImpl(ProgramaFidelizacionRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ProgramaFidelizacionEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ProgramaFidelizacionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ProgramaFidelizacionEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ProgramaFidelizacionEntity add(ProgramaFidelizacionEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ProgramaFidelizacionEntity update(ProgramaFidelizacionEntity obj, Long id) {
		ProgramaFidelizacionEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ProgramaFidelizacionEntity delete(Long id) {
		ProgramaFidelizacionEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ProgramaFidelizacionEntity enable(Long id) {
		ProgramaFidelizacionEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
