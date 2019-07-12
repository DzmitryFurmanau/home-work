package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.ProductDao;
import com.autoPartsStore.app.domain.Product;

import java.util.Collection;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private static ProductDao instance;

    private ProductDaoImpl() {

    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return null;
    }

    @Override
    public Product save(Product object) {
        return null;
    }

    @Override
    public Product update(Product object) {
        return null;
    }

    @Override
    public Collection<Product> getAll() {
        return null;
    }

    @Override
    public Product getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
