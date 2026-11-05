package pe.com.pmegacentimetros.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.pmegacentimetros.entity.StockAlmacenEntity;
import pe.com.pmegacentimetros.repository.StockAlmacenRepository;
import pe.com.pmegacentimetros.service.StockAlmacenService;

@Service
public class StockAlmacenServiceImpl implements StockAlmacenService {

	private final StockAlmacenRepository repositorio;

	StockAlmacenServiceImpl(StockAlmacenRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<StockAlmacenEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<StockAlmacenEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public StockAlmacenEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public StockAlmacenEntity add(StockAlmacenEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public StockAlmacenEntity update(StockAlmacenEntity obj, Long id) {
		StockAlmacenEntity objact = repositorio.findById(id).get();
		//se ignora el codigo para no perder la clave primaria
		BeanUtils.copyProperties(obj, objact, "codigo");
		return repositorio.save(objact);
	}

	@Override
	public StockAlmacenEntity delete(Long id) {
		StockAlmacenEntity objact = repositorio.findById(id).get();
		objact.setEstado(false);
		return repositorio.save(objact);
	}

	@Override
	public StockAlmacenEntity enable(Long id) {
		StockAlmacenEntity objact = repositorio.findById(id).get();
		objact.setEstado(true);
		return repositorio.save(objact);
	}
}
