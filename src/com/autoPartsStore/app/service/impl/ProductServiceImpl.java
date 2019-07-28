package com.autoPartsStore.app.service.impl;

import com.autoPartsStore.app.dao.ProductDao;
import com.autoPartsStore.app.dao.impl.ProductDaoImpl;
import com.autoPartsStore.app.domain.Product;
import com.autoPartsStore.app.service.ProductService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
    public Predicate<Product> sale(Integer count) {
        return productDao.sale(count);
    }

    @Override
    public Optional<Product> save(Product object) {
        return productDao.save(object);
    }

    @Override
    public Optional<Product> update(Product object) {
        return productDao.update(object);
    }

    @Override
    public Collection<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Supplier<Product> getByName(String name) {
        return productDao.getByName(name);
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
