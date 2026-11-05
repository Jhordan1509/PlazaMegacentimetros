package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.OrdenCompraEntity;
import pe.com.pmegacentimetros.repository.OrdenCompraRepository;
import pe.com.pmegacentimetros.service.OrdenCompraService;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService {

	private final OrdenCompraRepository repositorio;

	OrdenCompraServiceImpl(OrdenCompraRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<OrdenCompraEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<OrdenCompraEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public OrdenCompraEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public OrdenCompraEntity add(OrdenCompraEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public OrdenCompraEntity update(OrdenCompraEntity obj, Long id) {
		OrdenCompraEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public OrdenCompraEntity delete(Long id) {
		OrdenCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public OrdenCompraEntity enable(Long id) {
		OrdenCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
