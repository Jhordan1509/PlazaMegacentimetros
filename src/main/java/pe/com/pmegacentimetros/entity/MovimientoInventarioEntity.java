package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "MovimientoInventarioEntity")
@Table(name = "movimientoinventario")
public class MovimientoInventarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codmovinv")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "tipmov", length = 30, nullable = false)
	private String tipomovimiento;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@Column(name = "fecmov", nullable = false)
	private LocalDateTime fechamovimiento;

	@Column(name = "obs", length = 300, nullable = true)
	private String observacion;

	@Column(name = "estmovinv", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codprod", nullable = false)
	private ProductoEntity producto;

	@ManyToOne
	@JoinColumn(name = "codalmori", nullable = true)
	private AlmacenEntity almacenorigen;

	@ManyToOne
	@JoinColumn(name = "codalmdes", nullable = true)
	private AlmacenEntity almacendestino;

	@ManyToOne
	@JoinColumn(name = "codordcom", nullable = true)
	private OrdenCompraEntity ordencompra;

	@ManyToOne
	@JoinColumn(name = "codrec", nullable = true)
	private RecepcionCompraEntity recepcioncompra;

	@ManyToOne
	@JoinColumn(name = "codped", nullable = true)
	private PedidoEntity pedido;

	
}
