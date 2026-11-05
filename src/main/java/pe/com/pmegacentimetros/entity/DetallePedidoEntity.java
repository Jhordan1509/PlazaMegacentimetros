package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DetallePedidoEntity")
@Table(name = "detallepedido")
public class DetallePedidoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "coddetped")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@Column(name = "preuni", precision = 12, scale = 2, nullable = false)
	private BigDecimal preciounitario;

	@Column(name = "descue", precision = 12, scale = 2, nullable = false)
	private BigDecimal descuento;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "estdetped", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codped", nullable = false)
	private PedidoEntity pedido;

	@ManyToOne
	@JoinColumn(name = "codprod", nullable = false)
	private ProductoEntity producto;

	
}
