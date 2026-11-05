package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "ClienteCampaniaEntity")
@Table(name = "clientecampania")
public class ClienteCampaniaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codclicamp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "fecasig", nullable = false)
	private LocalDateTime fechaasignacion;

	@Column(name = "estclicamp", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codcli", nullable = false)
	private ClienteEntity cliente;

	@ManyToOne
	@JoinColumn(name = "codcamp", nullable = false)
	private CampaniaPromocionalEntity campania;

	
}
