package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.ControlAsistenciaEntity;

public interface ControlAsistenciaService {
	List<ControlAsistenciaEntity> findAll();
	List<ControlAsistenciaEntity> findAllCustom();
	ControlAsistenciaEntity findById(Long id);
	ControlAsistenciaEntity add(ControlAsistenciaEntity obj);
	ControlAsistenciaEntity update(ControlAsistenciaEntity obj, Long id);
	ControlAsistenciaEntity delete(Long id);
	ControlAsistenciaEntity enable(Long id);
}
