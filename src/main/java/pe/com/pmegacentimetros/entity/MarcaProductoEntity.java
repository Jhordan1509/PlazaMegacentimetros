package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "MarcaProductoEntity")
@Table(name = "marcaproducto")
public class MarcaProductoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codmar")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nommar", length = 100, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "estmarprod", nullable = false)
	private Boolean estado;

	
}
