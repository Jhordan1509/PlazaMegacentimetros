package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ProveedorEntity")
@Table(name = "proveedor")
public class ProveedorEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codprov")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "razsoc", length = 150, nullable = false)
	private String razonsocial;

	@Column(name = "numdoc", length = 20, nullable = false)
	private String numerodocumento;

	@Column(name = "contacto", length = 120, nullable = true)
	private String contacto;

	@Column(name = "tel", length = 20, nullable = true)
	private String telefono;

	@Column(name = "correo", length = 120, nullable = true)
	private String correo;

	@Column(name = "dir", length = 250, nullable = true)
	private String direccion;

	@Column(name = "fecreg", nullable = false)
	private LocalDateTime fecharegistro;

	@Column(name = "estprov", nullable = false)
	private Boolean estado;

	
}
