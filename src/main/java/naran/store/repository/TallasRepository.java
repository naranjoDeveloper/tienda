package naran.store.repository;

import naran.store.model.Tallas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallasRepository extends JpaRepository<Tallas ,Long> {
}
