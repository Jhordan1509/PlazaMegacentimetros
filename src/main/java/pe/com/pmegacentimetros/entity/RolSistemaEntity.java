package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "RolSistemaEntity")
@Table(name = "rolsistema")
public class RolSistemaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codrol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomrol", length = 80, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "estrol", nullable = false)
	private Boolean estado;

	
}
