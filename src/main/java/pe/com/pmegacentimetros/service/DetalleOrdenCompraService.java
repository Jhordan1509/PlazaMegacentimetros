package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.DetalleOrdenCompraEntity;

public interface DetalleOrdenCompraService {
	List<DetalleOrdenCompraEntity> findAll();
	List<DetalleOrdenCompraEntity> findAllCustom();
	DetalleOrdenCompraEntity findById(Long id);
	DetalleOrdenCompraEntity add(DetalleOrdenCompraEntity obj);
	DetalleOrdenCompraEntity update(DetalleOrdenCompraEntity obj, Long id);
	DetalleOrdenCompraEntity delete(Long id);
	DetalleOrdenCompraEntity enable(Long id);
}
