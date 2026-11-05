package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "RecepcionCompraEntity")
@Table(name = "recepcioncompra")
public class RecepcionCompraEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codrec")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numrec", length = 40, nullable = false)
	private String numerorecepcion;

	@Column(name = "fecrec", nullable = false)
	private LocalDateTime fecharecepcion;

	@Column(name = "obs", length = 300, nullable = true)
	private String observacion;

	@Column(name = "sitrec", length = 30, nullable = false)
	private String situacion;

	@Column(name = "estrecep", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codordcom", nullable = false)
	private OrdenCompraEntity ordencompra;

	@ManyToOne
	@JoinColumn(name = "codalm", nullable = false)
	private AlmacenEntity almacen;

	
}
