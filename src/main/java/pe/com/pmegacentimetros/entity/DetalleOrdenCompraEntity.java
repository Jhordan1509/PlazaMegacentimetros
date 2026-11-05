package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DetalleOrdenCompraEntity")
@Table(name = "detalleordencompra")
public class DetalleOrdenCompraEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "coddetoc")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@Column(name = "preuni", precision = 12, scale = 2, nullable = false)
	private BigDecimal preciounitario;

	@Column(name = "subtotal", precision = 12, scale = 2, nullable = false)
	private BigDecimal subtotal;

	@Column(name = "estdetordcom", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codordcom", nullable = false)
	private OrdenCompraEntity ordencompra;

	@ManyToOne
	@JoinColumn(name = "codprod", nullable = false)
	private ProductoEntity producto;

}
