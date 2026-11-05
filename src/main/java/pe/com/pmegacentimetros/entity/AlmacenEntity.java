package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "AlmacenEntity")
@Table(name = "almacen")
public class AlmacenEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codalm")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomalm", length = 120, nullable = false)
	private String nombre;

	@Column(name = "tipalm", length = 80, nullable = false)
	private String tipo;

	@Column(name = "ubicacion", length = 250, nullable = false)
	private String ubicacion;

	@Column(name = "capac", precision = 12, scale = 2, nullable = true)
	private BigDecimal capacidad;

	@Column(name = "sitalm", length = 30, nullable = false)
	private String situacion;

	@Column(name = "estalm", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codsuc", nullable = false)
	private SucursalEntity sucursal;

	
}
