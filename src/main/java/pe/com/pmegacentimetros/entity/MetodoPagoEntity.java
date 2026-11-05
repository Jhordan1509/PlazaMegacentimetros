package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "MetodoPagoEntity")
@Table(name = "metodopago")
public class MetodoPagoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codmetpag")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nommetpag", length = 60, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 200, nullable = true)
	private String descripcion;

	@Column(name = "estmetpag", nullable = false)
	private Boolean estado;

	
}
