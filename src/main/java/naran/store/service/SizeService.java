package naran.store.service;

import naran.store.model.Categorias;
import naran.store.model.Tallas;

import java.util.List;
import java.util.Optional;

public interface SizeService {

    public Tallas save(Tallas talla);

    public Optional<Tallas> getById(Long id);

    public void update(Tallas talla);

    public void delete(Long id);

    public List<Tallas> findAll();
}
