package naran.store.service;

import naran.store.model.Productos;
import naran.store.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductosRepository repo;

    @Override
    public Productos save(Productos product) {
        return repo.save(product);
    }

    @Override
    public Optional<Productos> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void update(Productos product) {
        repo.save(product);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }


    @Override
    public List<Productos> findAll() {
        return (List<Productos>) repo.findAll();
    }
}
