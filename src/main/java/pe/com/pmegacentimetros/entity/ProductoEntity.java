package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ProductoEntity")
@Table(name = "producto")
public class ProductoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codprod")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "codbarra", length = 40, nullable = false)
	private String codigobarra;

	@Column(name = "nomprod", length = 150, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 300, nullable = true)
	private String descripcion;

	@Column(name = "precom", precision = 12, scale = 2, nullable = false)
	private BigDecimal preciocompra;

	@Column(name = "preven", precision = 12, scale = 2, nullable = false)
	private BigDecimal precioventa;

	@Column(name = "stomin", nullable = false)
	private Integer stockminimo;

	@Column(name = "stomax", nullable = true)
	private Integer stockmaximo;

	@Column(name = "estprod", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codcat", nullable = false)
	private CategoriaProductoEntity categoria;

	@ManyToOne
	@JoinColumn(name = "codmar", nullable = false)
	private MarcaProductoEntity marca;

	@ManyToOne
	@JoinColumn(name = "codtipemp", nullable = false)
	private TipoEmpaqueEntity tipoempaque;

	
}
