package pe.com.pmegacentimetros.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "StockAlmacenEntity")
@Table(name = "stockalmacen")
public class StockAlmacenEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codstock")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "cantdisp", nullable = false)
	private Integer cantidaddisponible;

	@Column(name = "fecact", nullable = false)
	private LocalDateTime fechaactualizacion;

	@Column(name = "eststock", nullable = false)
	private Boolean estado;

	//claves foraneas

	@ManyToOne
	@JoinColumn(name = "codalm", nullable = false)
	private AlmacenEntity almacen;

	@ManyToOne
	@JoinColumn(name = "codprod", nullable = false)
	private ProductoEntity producto;

	//valores por defecto (la BD los pone, pero aqui se asignan si no se envian en el POST)
	

	
}
