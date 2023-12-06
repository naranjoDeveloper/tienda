package naran.store.service;

import naran.store.model.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public Productos save(Productos product);

    public Optional<Productos> getById(Long id);

    public void update(Productos product);

    public void delete(Long id);

    public List<Productos> findAll();


}
