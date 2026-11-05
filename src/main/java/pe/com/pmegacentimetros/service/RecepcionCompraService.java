package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.RecepcionCompraEntity;

public interface RecepcionCompraService {
	List<RecepcionCompraEntity> findAll();
	List<RecepcionCompraEntity> findAllCustom();
	RecepcionCompraEntity findById(Long id);
	RecepcionCompraEntity add(RecepcionCompraEntity obj);
	RecepcionCompraEntity update(RecepcionCompraEntity obj, Long id);
	RecepcionCompraEntity delete(Long id);
	RecepcionCompraEntity enable(Long id);
}
