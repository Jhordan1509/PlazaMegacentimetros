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
@Entity(name = "PedidoEntity")
@Table(name = "pedido")
public class PedidoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codped")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numped", length = 40, nullable = false)
	private String numeropedido;

	@Column(name = "fecped", nullable = false)
	private LocalDateTime fechapedido;

	@Column(name = "sitped", length = 30, nullable = false)
	private String situacion;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "descue", precision = 12, scale = 2, nullable = false)
	private BigDecimal descuento;

	@Column(name = "igv", precision = 12, scale = 2, nullable = false)
	private BigDecimal igv;

	@Column(name = "total", precision = 12, scale = 2, nullable = false)
	private BigDecimal total;

	@Column(name = "obs", length = 300, nullable = true)
	private String observacion;

	@Column(name = "estped", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codcli", nullable = false)
	private ClienteEntity cliente;

	
}
