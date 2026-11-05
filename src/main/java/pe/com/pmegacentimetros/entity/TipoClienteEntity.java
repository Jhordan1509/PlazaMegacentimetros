package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "TipoClienteEntity")
@Table(name = "tipocliente")
public class TipoClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codtipcli")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomtipcli", length = 60, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "esttipcli", nullable = false)
	private Boolean estado;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	
}
