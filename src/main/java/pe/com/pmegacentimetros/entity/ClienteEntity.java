package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ClienteEntity")
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codcli")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nombres", length = 100, nullable = false)
	private String nombres;

	@Column(name = "apellidos", length = 100, nullable = true)
	private String apellidos;

	@Column(name = "razsoc", length = 150, nullable = true)
	private String razonsocial;

	@Column(name = "numdoc", length = 20, nullable = false)
	private String numerodocumento;

	@Column(name = "tel", length = 20, nullable = true)
	private String telefono;

	@Column(name = "correo", length = 120, nullable = true)
	private String correo;

	@Column(name = "dir", length = 250, nullable = true)
	private String direccion;

	@Column(name = "fecreg", nullable = false)
	private LocalDateTime fecharegistro;

	@Column(name = "estcli", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codtipd", nullable = false)
	private TipoDocumentoEntity tipodocumento;

	@ManyToOne
	@JoinColumn(name = "codsex", nullable = true)
	private SexoEntity sexo;

	@ManyToOne
	@JoinColumn(name = "coddis", nullable = true)
	private DistritoEntity distrito;

	@ManyToOne
	@JoinColumn(name = "codtipcli", nullable = false)
	private TipoClienteEntity tipocliente;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	
}
