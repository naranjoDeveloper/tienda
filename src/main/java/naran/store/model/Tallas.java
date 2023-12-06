package naran.store.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sizes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Tallas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "sizes" , fetch = FetchType.EAGER)
    private Set<Productos> productos = new HashSet<>();

}
