package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.ProductoEntity;

public interface ProductoService {
	List<ProductoEntity> findAll();
	List<ProductoEntity> findAllCustom();
	ProductoEntity findById(Long id);
	ProductoEntity add(ProductoEntity obj);
	ProductoEntity update(ProductoEntity obj, Long id);
	ProductoEntity delete(Long id);
	ProductoEntity enable(Long id);
}
