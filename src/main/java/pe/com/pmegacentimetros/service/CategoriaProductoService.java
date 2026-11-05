package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.CategoriaProductoEntity;

public interface CategoriaProductoService {
	List<CategoriaProductoEntity> findAll();
	List<CategoriaProductoEntity> findAllCustom();
	CategoriaProductoEntity findById(Long id);
	CategoriaProductoEntity add(CategoriaProductoEntity obj);
	CategoriaProductoEntity update(CategoriaProductoEntity obj, Long id);
	CategoriaProductoEntity delete(Long id);
	CategoriaProductoEntity enable(Long id);
}
