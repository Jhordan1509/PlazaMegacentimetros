package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "TipoDocumentoEntity")
@Table(name = "tipodocumento")
public class TipoDocumentoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codtipd")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomtipd", length = 50, nullable = false)
	private String nombre;

	@Column(name = "esttipdoc", nullable = false)
	private Boolean estado;

	
}
