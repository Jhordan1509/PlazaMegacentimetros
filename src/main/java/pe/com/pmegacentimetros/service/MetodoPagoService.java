package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.MetodoPagoEntity;

public interface MetodoPagoService {
	List<MetodoPagoEntity> findAll();
	List<MetodoPagoEntity> findAllCustom();
	MetodoPagoEntity findById(Long id);
	MetodoPagoEntity add(MetodoPagoEntity obj);
	MetodoPagoEntity update(MetodoPagoEntity obj, Long id);
	MetodoPagoEntity delete(Long id);
	MetodoPagoEntity enable(Long id);
}
