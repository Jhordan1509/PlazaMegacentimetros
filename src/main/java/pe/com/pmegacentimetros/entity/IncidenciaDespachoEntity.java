package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "IncidenciaDespachoEntity")
@Table(name = "incidenciadespacho")
public class IncidenciaDespachoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codinc")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "tipinc", length = 30, nullable = false)
	private String tipoincidencia;

	@Column(name = "descrip", length = 500, nullable = false)
	private String descripcion;

	@Column(name = "fecinc", nullable = false)
	private LocalDateTime fechaincidencia;

	@Column(name = "sitres", length = 30, nullable = false)
	private String situacionresolucion;

	@Column(name = "solucion", length = 500, nullable = true)
	private String solucion;

	@Column(name = "estinc", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "coddesp", nullable = false)
	private DespachoEntity despacho;

	
}
