package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CampaniaPromocionalEntity")
@Table(name = "campaniapromocional")
public class CampaniaPromocionalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codcamp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nomcamp", length = 120, nullable = false)
	private String nombre;

	@Column(name = "descrip", length = 300, nullable = true)
	private String descripcion;

	@Column(name = "fecini", nullable = false)
	private LocalDate fechainicio;

	@Column(name = "fecfin", nullable = false)
	private LocalDate fechafin;

	@Column(name = "tipdesc", length = 30, nullable = false)
	private String tipodescuento;

	@Column(name = "valdesc", precision = 10, scale = 2, nullable = false)
	private BigDecimal valordescuento;

	@Column(name = "sitcamp", length = 30, nullable = false)
	private String situacion;

	@Column(name = "estcamp", nullable = false)
	private Boolean estado;

	
}
