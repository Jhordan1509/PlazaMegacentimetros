package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "OrdenCompraEntity")
@Table(name = "ordencompra")
public class OrdenCompraEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codordcom")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numord", length = 30, nullable = false)
	private String numeroorden;

	@Column(name = "fecord", nullable = false)
	private LocalDateTime fechaorden;

	@Column(name = "fecentest", nullable = true)
	private LocalDate fechaentregaestimada;

	@Column(name = "sitoc", length = 30, nullable = false)
	private String situacion;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "igv", precision = 12, scale = 2, nullable = false)
	private BigDecimal igv;

	@Column(name = "total", precision = 12, scale = 2, nullable = false)
	private BigDecimal total;

	@Column(name = "obs", length = 300, nullable = true)
	private String observacion;

	@Column(name = "estordcom", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codprov", nullable = false)
	private ProveedorEntity proveedor;

	
}
