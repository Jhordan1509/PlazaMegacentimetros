package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "AuditoriaLogEntity")
@Table(name = "auditorialog")
public class AuditoriaLogEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codaud")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "feceve", nullable = false)
	private LocalDateTime fechaevento;

	@Column(name = "accion", length = 80, nullable = false)
	private String accion;

	@Column(name = "modulo", length = 80, nullable = false)
	private String modulo;

	@Column(name = "descrip", length = 500, nullable = true)
	private String descripcion;

	@Column(name = "dirip", length = 45, nullable = true)
	private String direccionip;

	@Column(name = "estaud", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codusu", nullable = true)
	private UsuarioCredencialEntity usuario;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	@PrePersist
	private void prePersist() {
		if (estado == null) estado = true;
		if (fechaevento == null) fechaevento = LocalDateTime.now();
	}
}
