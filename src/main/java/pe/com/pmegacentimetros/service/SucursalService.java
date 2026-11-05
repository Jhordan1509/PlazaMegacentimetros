package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.SucursalEntity;

public interface SucursalService {
	List<SucursalEntity> findAll();
	List<SucursalEntity> findAllCustom();
	SucursalEntity findById(Long id);
	SucursalEntity add(SucursalEntity obj);
	SucursalEntity update(SucursalEntity obj, Long id);
	SucursalEntity delete(Long id);
	SucursalEntity enable(Long id);
}
