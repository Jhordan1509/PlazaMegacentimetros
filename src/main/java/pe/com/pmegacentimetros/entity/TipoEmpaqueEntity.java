package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "TipoEmpaqueEntity")
@Table(name = "tipoempaque")
public class TipoEmpaqueEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codtipemp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomemp", length = 80, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "esttipemp", nullable = false)
	private Boolean estado;

	
}
