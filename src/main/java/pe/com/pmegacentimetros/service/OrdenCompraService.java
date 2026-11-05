package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.OrdenCompraEntity;

public interface OrdenCompraService {
	List<OrdenCompraEntity> findAll();
	List<OrdenCompraEntity> findAllCustom();
	OrdenCompraEntity findById(Long id);
	OrdenCompraEntity add(OrdenCompraEntity obj);
	OrdenCompraEntity update(OrdenCompraEntity obj, Long id);
	OrdenCompraEntity delete(Long id);
	OrdenCompraEntity enable(Long id);
}
