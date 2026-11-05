package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.FacturaProveedorEntity;
import pe.com.pmegacentimetros.repository.FacturaProveedorRepository;
import pe.com.pmegacentimetros.service.FacturaProveedorService;

@Service
public class FacturaProveedorServiceImpl implements FacturaProveedorService {

	private final FacturaProveedorRepository repositorio;

	FacturaProveedorServiceImpl(FacturaProveedorRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<FacturaProveedorEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<FacturaProveedorEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public FacturaProveedorEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public FacturaProveedorEntity add(FacturaProveedorEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public FacturaProveedorEntity update(FacturaProveedorEntity obj, Long id) {
		FacturaProveedorEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public FacturaProveedorEntity delete(Long id) {
		FacturaProveedorEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public FacturaProveedorEntity enable(Long id) {
		FacturaProveedorEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
