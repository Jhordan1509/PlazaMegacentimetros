package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.TipoEmpaqueEntity;

public interface TipoEmpaqueService {
	List<TipoEmpaqueEntity> findAll();
	List<TipoEmpaqueEntity> findAllCustom();
	TipoEmpaqueEntity findById(Long id);
	TipoEmpaqueEntity add(TipoEmpaqueEntity obj);
	TipoEmpaqueEntity update(TipoEmpaqueEntity obj, Long id);
	TipoEmpaqueEntity delete(Long id);
	TipoEmpaqueEntity enable(Long id);
}
