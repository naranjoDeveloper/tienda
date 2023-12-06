package naran.store.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int stock;

    private String image;

    private String description;

    private int price;

    @ManyToOne
    private Categorias categorie;

    @ManyToMany(
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "product_size",
            joinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "talla_id" , referencedColumnName = "id"))
    private Set<Tallas> sizes = new HashSet<>();
}