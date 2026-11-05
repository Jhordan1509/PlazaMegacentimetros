package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CategoriaProductoEntity")
@Table(name = "categoriaproducto")
public class CategoriaProductoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codcat")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomcat", length = 100, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 250, nullable = true)
	private String descripcion;

	@Column(name = "estcatprod", nullable = false)
	private Boolean estado;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	@PrePersist
	private void prePersist() {
		if (estado == null) estado = true;
	}
}
