package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "FacturaVentaEntity")
@Table(name = "facturaventa")
public class FacturaVentaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codfacven")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numfac", length = 40, nullable = false)
	private String numerofactura;

	@Column(name = "fecemi", nullable = false)
	private LocalDateTime fechaemision;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "descue", precision = 12, scale = 2, nullable = false)
	private BigDecimal descuento;

	@Column(name = "igv", precision = 12, scale = 2, nullable = false)
	private BigDecimal igv;

	@Column(name = "total", precision = 12, scale = 2, nullable = false)
	private BigDecimal total;

	@Column(name = "sitfac", length = 30, nullable = false)
	private String situacion;

	@Column(name = "estfacven", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codped", nullable = false)
	private PedidoEntity pedido;

	
}
