package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ControlAsistenciaEntity")
@Table(name = "controlasistencia")
public class ControlAsistenciaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codasis")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;

	@Column(name = "horent", nullable = true)
	private LocalTime horaentrada;

	@Column(name = "horsal", nullable = true)
	private LocalTime horasalida;

	@Column(name = "sitasis", length = 30, nullable = false)
	private String situacion;

	@Column(name = "obs", length = 250, nullable = true)
	private String observacion;

	@Column(name = "estasistencia", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codper", nullable = false)
	private PersonalEntity personal;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	
}
