package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "PersonalEntity")
@Table(name = "personal")
public class PersonalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codper")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nombres", length = 100, nullable = false)
	private String nombres;

	@Column(name = "apellidos", length = 100, nullable = false)
	private String apellidos;

	@Column(name = "numdoc", length = 20, nullable = false)
	private String numerodocumento;

	@Column(name = "tel", length = 20, nullable = true)
	private String telefono;

	@Column(name = "correo", length = 120, nullable = true)
	private String correo;

	@Column(name = "dir", length = 250, nullable = true)
	private String direccion;

	@Column(name = "feccont", nullable = false)
	private LocalDate fechacontrato;

	@Column(name = "rol", length = 80, nullable = false)
	private String rol;

	@Column(name = "estper", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codsuc", nullable = false)
	private SucursalEntity sucursal;

	@ManyToOne
	@JoinColumn(name = "codtipd", nullable = false)
	private TipoDocumentoEntity tipodocumento;

	@ManyToOne
	@JoinColumn(name = "codsex", nullable = true)
	private SexoEntity sexo;

	@ManyToOne
	@JoinColumn(name = "coddis", nullable = true)
	private DistritoEntity distrito;

	
}
