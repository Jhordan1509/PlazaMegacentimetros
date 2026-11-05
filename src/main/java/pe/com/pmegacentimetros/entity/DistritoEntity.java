package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DistritoEntity")
@Table(name = "distrito")
public class DistritoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "coddis")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomdis", length = 100, nullable = false)
	private String nombre;

	@Column(name = "estdis", nullable = false)
	private Boolean estado;

	
}
