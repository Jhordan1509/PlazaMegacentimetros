package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "UsuarioCredencialEntity")
@Table(name = "usuariocredencial")
public class UsuarioCredencialEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codusu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomusu", length = 80, nullable = false)
	private String nombreusuario;

	@Column(name = "correo", length = 120, nullable = false)
	private String correo;

	@Column(name = "clavehash", length = 255, nullable = false)
	private String clavehash;

	@Column(name = "feccre", nullable = false)
	private LocalDateTime fechacreacion;

	@Column(name = "ultacc", nullable = true)
	private LocalDateTime ultimoacceso;

	@Column(name = "estusu", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codper", nullable = true)
	private PersonalEntity personal;

	@ManyToOne
	@JoinColumn(name = "codrol", nullable = false)
	private RolSistemaEntity rolsistema;

	
}
