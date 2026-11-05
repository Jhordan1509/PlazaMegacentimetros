package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.FacturaVentaEntity;

public interface FacturaVentaService {
	List<FacturaVentaEntity> findAll();
	List<FacturaVentaEntity> findAllCustom();
	FacturaVentaEntity findById(Long id);
	FacturaVentaEntity add(FacturaVentaEntity obj);
	FacturaVentaEntity update(FacturaVentaEntity obj, Long id);
	FacturaVentaEntity delete(Long id);
	FacturaVentaEntity enable(Long id);
}
