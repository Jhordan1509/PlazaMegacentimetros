package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.AuditoriaLogEntity;
import pe.com.pmegacentimetros.repository.AuditoriaLogRepository;
import pe.com.pmegacentimetros.service.AuditoriaLogService;

@Service
public class AuditoriaLogServiceImpl implements AuditoriaLogService {

	private final AuditoriaLogRepository repositorio;

	AuditoriaLogServiceImpl(AuditoriaLogRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<AuditoriaLogEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<AuditoriaLogEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public AuditoriaLogEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public AuditoriaLogEntity add(AuditoriaLogEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public AuditoriaLogEntity update(AuditoriaLogEntity obj, Long id) {
		AuditoriaLogEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public AuditoriaLogEntity delete(Long id) {
		AuditoriaLogEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public AuditoriaLogEntity enable(Long id) {
		AuditoriaLogEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
