package naran.store.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_size")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ProductoTalla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Productos producto;

    @ManyToOne
    @JoinColumn(name = "talla_id")
    private Tallas talla;
}
