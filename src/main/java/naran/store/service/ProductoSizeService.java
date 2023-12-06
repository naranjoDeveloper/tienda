package naran.store.service;

import naran.store.model.ProductoTalla;
import naran.store.model.Productos;

import java.util.List;

public interface ProductoSizeService {

    public List<ProductoTalla> findAll();
}
