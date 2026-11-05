package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "TransportistaEntity")
@Table(name = "transportista")
public class TransportistaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codtransp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomtransp", length = 120, nullable = false)
	private String nombre;

	@Column(name = "numdoc", length = 20, nullable = true)
	private String numerodocumento;

	@Column(name = "tel", length = 20, nullable = true)
	private String telefono;

	@Column(name = "correo", length = 120, nullable = true)
	private String correo;

	@Column(name = "tiptransp", length = 80, nullable = true)
	private String tipotransporte;

	@Column(name = "placa", length = 15, nullable = true)
	private String placa;

	@Column(name = "esttransp", nullable = false)
	private Boolean estado;

	
}
