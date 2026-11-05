package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.ProductoEntity;
import pe.com.pmegacentimetros.repository.ProductoRepository;
import pe.com.pmegacentimetros.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	private final ProductoRepository repositorio;

	ProductoServiceImpl(ProductoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<ProductoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ProductoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ProductoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ProductoEntity add(ProductoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public ProductoEntity update(ProductoEntity obj, Long id) {
		ProductoEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public ProductoEntity delete(Long id) {
		ProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public ProductoEntity enable(Long id) {
		ProductoEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
