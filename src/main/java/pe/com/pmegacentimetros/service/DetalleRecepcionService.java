package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.DetalleRecepcionEntity;

public interface DetalleRecepcionService {
	List<DetalleRecepcionEntity> findAll();
	List<DetalleRecepcionEntity> findAllCustom();
	DetalleRecepcionEntity findById(Long id);
	DetalleRecepcionEntity add(DetalleRecepcionEntity obj);
	DetalleRecepcionEntity update(DetalleRecepcionEntity obj, Long id);
	DetalleRecepcionEntity delete(Long id);
	DetalleRecepcionEntity enable(Long id);
}
