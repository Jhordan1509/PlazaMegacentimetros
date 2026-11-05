package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.PedidoEntity;
import pe.com.pmegacentimetros.repository.PedidoRepository;
import pe.com.pmegacentimetros.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	private final PedidoRepository repositorio;

	PedidoServiceImpl(PedidoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<PedidoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<PedidoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public PedidoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PedidoEntity add(PedidoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public PedidoEntity update(PedidoEntity obj, Long id) {
		PedidoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public PedidoEntity delete(Long id) {
		PedidoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public PedidoEntity enable(Long id) {
		PedidoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
