package main.java.autoPartsStore.service.impl;

import main.java.autoPartsStore.dao.ProductDao;
import main.java.autoPartsStore.dao.impl.ProductDaoImpl;
import main.java.autoPartsStore.domain.Product;
import main.java.autoPartsStore.service.ProductService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private static ProductService instance;

    private ProductDao productDao = ProductDaoImpl.getInstance();

    private ProductServiceImpl() {

    }

    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductServiceImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return productDao.getByPrice(price);
    }

    @Override
    public Optional<Product> sale(Product product, Integer count) {
        product.setCount(product.getCount() - count);
        return productDao.update(product);
    }

    @Override
    public Optional<Product> save(Product product) {
        return productDao.save(product);
    }

    @Override
    public Optional<Product> update(Product product) {
        return productDao.update(product);
    }

    @Override
    public Collection<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return productDao.getById(id);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }

    @Override
    public void deleteAll() {
        productDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }
}