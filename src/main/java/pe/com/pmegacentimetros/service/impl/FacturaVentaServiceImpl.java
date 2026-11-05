package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.FacturaVentaEntity;
import pe.com.pmegacentimetros.repository.FacturaVentaRepository;
import pe.com.pmegacentimetros.service.FacturaVentaService;

@Service
public class FacturaVentaServiceImpl implements FacturaVentaService {

	private final FacturaVentaRepository repositorio;

	FacturaVentaServiceImpl(FacturaVentaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<FacturaVentaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<FacturaVentaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public FacturaVentaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public FacturaVentaEntity add(FacturaVentaEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public FacturaVentaEntity update(FacturaVentaEntity obj, Long id) {
		FacturaVentaEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public FacturaVentaEntity delete(Long id) {
		FacturaVentaEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public FacturaVentaEntity enable(Long id) {
		FacturaVentaEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
