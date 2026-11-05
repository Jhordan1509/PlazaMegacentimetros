package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.RecepcionCompraEntity;
import pe.com.pmegacentimetros.repository.RecepcionCompraRepository;
import pe.com.pmegacentimetros.service.RecepcionCompraService;

@Service
public class RecepcionCompraServiceImpl implements RecepcionCompraService {

	private final RecepcionCompraRepository repositorio;

	RecepcionCompraServiceImpl(RecepcionCompraRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<RecepcionCompraEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<RecepcionCompraEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public RecepcionCompraEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public RecepcionCompraEntity add(RecepcionCompraEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public RecepcionCompraEntity update(RecepcionCompraEntity obj, Long id) {
		RecepcionCompraEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public RecepcionCompraEntity delete(Long id) {
		RecepcionCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public RecepcionCompraEntity enable(Long id) {
		RecepcionCompraEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
