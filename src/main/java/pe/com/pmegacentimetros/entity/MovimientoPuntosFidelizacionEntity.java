package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "MovimientoPuntosFidelizacionEntity")
@Table(name = "movimientopuntosfidelizacion")
public class MovimientoPuntosFidelizacionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codmovpun")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "tipmov", length = 30, nullable = false)
	private String tipomovimiento;

	@Column(name = "puntos", nullable = false)
	private Integer puntos;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "fecmov", nullable = false)
	private LocalDateTime fechamovimiento;

	@Column(name = "estmovpuntos", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codprog", nullable = false)
	private ProgramaFidelizacionEntity programa;

	
}
