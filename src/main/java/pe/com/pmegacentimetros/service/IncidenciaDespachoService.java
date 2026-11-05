package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.IncidenciaDespachoEntity;

public interface IncidenciaDespachoService {
	List<IncidenciaDespachoEntity> findAll();
	List<IncidenciaDespachoEntity> findAllCustom();
	IncidenciaDespachoEntity findById(Long id);
	IncidenciaDespachoEntity add(IncidenciaDespachoEntity obj);
	IncidenciaDespachoEntity update(IncidenciaDespachoEntity obj, Long id);
	IncidenciaDespachoEntity delete(Long id);
	IncidenciaDespachoEntity enable(Long id);
}
