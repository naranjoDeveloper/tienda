package naran.store.service;

import naran.store.model.ProductoTalla;
import naran.store.repository.ProductoTallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoSizeServiceImpl implements ProductoSizeService{

    @Autowired
    ProductoTallaRepository repo;

    @Override
    public List<ProductoTalla> findAll() {
        return repo.findAll();
    }
}
