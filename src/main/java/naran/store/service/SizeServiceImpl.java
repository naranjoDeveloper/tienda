package naran.store.service;

import naran.store.model.Categorias;
import naran.store.model.Tallas;
import naran.store.repository.TallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeServiceImpl implements SizeService{

    @Autowired
    TallasRepository repo;

    @Override
    public Tallas save(Tallas talla) {
        return repo.save(talla);
    }

    @Override
    public Optional<Tallas> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void update(Tallas talla) {
        repo.save(talla);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Tallas> findAll() {
        return repo.findAll();
    }
}
