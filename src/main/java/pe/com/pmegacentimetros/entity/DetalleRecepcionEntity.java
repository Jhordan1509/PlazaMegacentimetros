package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DetalleRecepcionEntity")
@Table(name = "detallerecepcion")
public class DetalleRecepcionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "coddetrec")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "cantrec", nullable = false)
	private Integer cantidadrecibida;

	@Column(name = "obs", length = 250, nullable = true)
	private String observacion;

	@Column(name = "estdetrecep", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codrec", nullable = false)
	private RecepcionCompraEntity recepcioncompra;

	@ManyToOne
	@JoinColumn(name = "coddetoc", nullable = false)
	private DetalleOrdenCompraEntity detalleordencompra;

	
}
