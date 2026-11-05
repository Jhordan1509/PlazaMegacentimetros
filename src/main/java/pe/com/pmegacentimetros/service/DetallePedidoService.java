package pe.com.pmegacentimetros.service;

import java.util.List;

import pe.com.pmegacentimetros.entity.DetallePedidoEntity;

public interface DetallePedidoService {
	List<DetallePedidoEntity> findAll();
	List<DetallePedidoEntity> findAllCustom();
	DetallePedidoEntity findById(Long id);
	DetallePedidoEntity add(DetallePedidoEntity obj);
	DetallePedidoEntity update(DetallePedidoEntity obj, Long id);
	DetallePedidoEntity delete(Long id);
	DetallePedidoEntity enable(Long id);
}
