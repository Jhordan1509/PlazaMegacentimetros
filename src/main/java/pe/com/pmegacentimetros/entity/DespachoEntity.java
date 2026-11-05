package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DespachoEntity")
@Table(name = "despacho")
public class DespachoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "coddesp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "numguia", length = 40, nullable = false)
	private String numeroguia;

	@Column(name = "fecdesp", nullable = false)
	private LocalDateTime fechadespacho;

	@Column(name = "fecentest", nullable = true)
	private LocalDateTime fechaentregaestimada;

	@Column(name = "fecentreal", nullable = true)
	private LocalDateTime fechaentregareal;

	@Column(name = "sitent", length = 30, nullable = false)
	private String situacion;

	@Column(name = "dirent", length = 250, nullable = false)
	private String direccionentrega;

	@Column(name = "obs", length = 300, nullable = true)
	private String observacion;

	@Column(name = "estdesp", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codped", nullable = false)
	private PedidoEntity pedido;

	@ManyToOne
	@JoinColumn(name = "codtransp", nullable = true)
	private TransportistaEntity transportista;

	@ManyToOne
	@JoinColumn(name = "codperres", nullable = false)
	private PersonalEntity personalresponsable;

	
}
