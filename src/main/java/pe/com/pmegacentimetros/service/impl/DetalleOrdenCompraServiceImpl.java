package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.DetalleOrdenCompraEntity;
import pe.com.pmegacentimetros.repository.DetalleOrdenCompraRepository;
import pe.com.pmegacentimetros.service.DetalleOrdenCompraService;

@Service
public class DetalleOrdenCompraServiceImpl implements DetalleOrdenCompraService {

	private final DetalleOrdenCompraRepository repositorio;

	DetalleOrdenCompraServiceImpl(DetalleOrdenCompraRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<DetalleOrdenCompraEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DetalleOrdenCompraEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DetalleOrdenCompraEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DetalleOrdenCompraEntity add(DetalleOrdenCompraEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public DetalleOrdenCompraEntity update(DetalleOrdenCompraEntity obj, Long id) {
		DetalleOrdenCompraEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public DetalleOrdenCompraEntity delete(Long id) {
		DetalleOrdenCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public DetalleOrdenCompraEntity enable(Long id) {
		DetalleOrdenCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
