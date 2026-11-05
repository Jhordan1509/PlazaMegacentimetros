package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.CampaniaPromocionalEntity;

public interface CampaniaPromocionalService {
	List<CampaniaPromocionalEntity> findAll();
	List<CampaniaPromocionalEntity> findAllCustom();
	CampaniaPromocionalEntity findById(Long id);
	CampaniaPromocionalEntity add(CampaniaPromocionalEntity obj);
	CampaniaPromocionalEntity update(CampaniaPromocionalEntity obj, Long id);
	CampaniaPromocionalEntity delete(Long id);
	CampaniaPromocionalEntity enable(Long id);
}
