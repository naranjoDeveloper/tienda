package naran.store.service;

import naran.store.model.Categorias;
import naran.store.model.Productos;

import java.util.List;
import java.util.Optional;

public interface CategorieService {

    public Categorias save(Categorias categoria);

    public Optional<Categorias> getById(Long id);

    public void update(Categorias categoria);

    public void delete(Long id);

    public List<Categorias> findAll();

}
