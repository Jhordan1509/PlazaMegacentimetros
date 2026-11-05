package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.CategoriaProductoEntity;
import pe.com.pmegacentimetros.repository.CategoriaProductoRepository;
import pe.com.pmegacentimetros.service.CategoriaProductoService;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

	private final CategoriaProductoRepository repositorio;

	CategoriaProductoServiceImpl(CategoriaProductoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<CategoriaProductoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<CategoriaProductoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public CategoriaProductoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CategoriaProductoEntity add(CategoriaProductoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public CategoriaProductoEntity update(CategoriaProductoEntity obj, Long id) {
		CategoriaProductoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public CategoriaProductoEntity delete(Long id) {
		CategoriaProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public CategoriaProductoEntity enable(Long id) {
		CategoriaProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
