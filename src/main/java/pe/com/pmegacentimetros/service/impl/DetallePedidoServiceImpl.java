package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.DetallePedidoEntity;
import pe.com.pmegacentimetros.repository.DetallePedidoRepository;
import pe.com.pmegacentimetros.service.DetallePedidoService;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

	private final DetallePedidoRepository repositorio;

	DetallePedidoServiceImpl(DetallePedidoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<DetallePedidoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DetallePedidoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DetallePedidoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DetallePedidoEntity add(DetallePedidoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public DetallePedidoEntity update(DetallePedidoEntity obj, Long id) {
		DetallePedidoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public DetallePedidoEntity delete(Long id) {
		DetallePedidoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public DetallePedidoEntity enable(Long id) {
		DetallePedidoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
