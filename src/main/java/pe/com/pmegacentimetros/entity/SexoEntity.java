package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "SexoEntity")
@Table(name = "sexo")
public class SexoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codsex")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomsex", length = 50, nullable = false)
	private String nombre;

	@Column(name = "estsex", nullable = false)
	private Boolean estado;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	
}
