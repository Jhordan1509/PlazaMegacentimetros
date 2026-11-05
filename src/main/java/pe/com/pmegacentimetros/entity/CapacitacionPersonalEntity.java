package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CapacitacionPersonalEntity")
@Table(name = "capacitacionpersonal")
public class CapacitacionPersonalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codcap")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomcap", length = 150, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 300, nullable = true)
	private String descripcion;

	@Column(name = "fecini", nullable = false)
	private LocalDate fechainicio;

	@Column(name = "fecfin", nullable = true)
	private LocalDate fechafin;

	@Column(name = "instit", length = 150, nullable = true)
	private String institucion;

	@Column(name = "estcap", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codper", nullable = false)
	private PersonalEntity personal;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	@PrePersist
	private void prePersist() {
		if (estado == null) estado = true;
	}
}
