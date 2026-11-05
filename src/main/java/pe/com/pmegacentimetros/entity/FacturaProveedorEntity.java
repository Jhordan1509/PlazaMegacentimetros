package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "FacturaProveedorEntity")
@Table(name = "facturaproveedor")
public class FacturaProveedorEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codfacprov")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numfac", length = 40, nullable = false)
	private String numerofactura;

	@Column(name = "fecemi", nullable = false)
	private LocalDate fechaemision;

	@Column(name = "fecven", nullable = true)
	private LocalDate fechavencimiento;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "igv", precision = 12, scale = 2, nullable = false)
	private BigDecimal igv;

	@Column(name = "total", precision = 12, scale = 2, nullable = false)
	private BigDecimal total;

	@Column(name = "sitfac", length = 30, nullable = false)
	private String situacion;

	@Column(name = "estfacprov", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codprov", nullable = false)
	private ProveedorEntity proveedor;

	@ManyToOne
	@JoinColumn(name = "codordcom", nullable = true)
	private OrdenCompraEntity ordencompra;

	
}
