package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.MarcaProductoEntity;
import pe.com.pmegacentimetros.repository.MarcaProductoRepository;
import pe.com.pmegacentimetros.service.MarcaProductoService;

@Service
public class MarcaProductoServiceImpl implements MarcaProductoService {

	private final MarcaProductoRepository repositorio;

	MarcaProductoServiceImpl(MarcaProductoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MarcaProductoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MarcaProductoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MarcaProductoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MarcaProductoEntity add(MarcaProductoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public MarcaProductoEntity update(MarcaProductoEntity obj, Long id) {
		MarcaProductoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public MarcaProductoEntity delete(Long id) {
		MarcaProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public MarcaProductoEntity enable(Long id) {
		MarcaProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
