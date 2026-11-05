package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ProgramaFidelizacionEntity")
@Table(name = "programafidelizacion")
public class ProgramaFidelizacionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codprog")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "punacu", nullable = false)
	private Integer puntosacumulados;

	@Column(name = "nivel", length = 30, nullable = false)
	private String nivel;

	@Column(name = "fecins", nullable = false)
	private LocalDate fechainscripcion;

	@Column(name = "estprogfid", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codcli", nullable = false)
	private ClienteEntity cliente;

	
}
