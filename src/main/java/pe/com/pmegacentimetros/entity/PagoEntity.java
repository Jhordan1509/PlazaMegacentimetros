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
@Entity(name = "PagoEntity")
@Table(name = "pago")
public class PagoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codpag")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "fecpag", nullable = false)
	private LocalDateTime fechapago;

	@Column(name = "monto", precision = 12, scale = 2, nullable = false)
	private BigDecimal monto;

	@Column(name = "sitpag", length = 30, nullable = false)
	private String situacion;

	@Column(name = "numoper", length = 80, nullable = true)
	private String numerooperacion;

	@Column(name = "obs", length = 250, nullable = true)
	private String observacion;

	@Column(name = "estpag", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codmetpag", nullable = false)
	private MetodoPagoEntity metodopago;

	@ManyToOne
	@JoinColumn(name = "codfacven", nullable = true)
	private FacturaVentaEntity facturaventa;

	@ManyToOne
	@JoinColumn(name = "codfacprov", nullable = true)
	private FacturaProveedorEntity facturaproveedor;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	
}
