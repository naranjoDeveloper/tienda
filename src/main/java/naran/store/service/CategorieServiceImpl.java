package naran.store.service;

import naran.store.model.Categorias;
import naran.store.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl implements  CategorieService{

    @Autowired
    CategoriasRepository repo;
    @Override
    public Categorias save(Categorias categoria) {
        return repo.save(categoria);
    }

    @Override
    public Optional<Categorias> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void update(Categorias categoria) {
        repo.save(categoria);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Categorias> findAll() {
        return repo.findAll();
    }
}
