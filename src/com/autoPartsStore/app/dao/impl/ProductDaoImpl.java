package com.autoPartsStore.app.dao.impl;


import com.autoPartsStore.app.domain.Product;
import com.autoPartsStore.app.dao.ProductDao;

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
    public Product[] getByPrice(Double price) {
        return new Product[0];
    }

    @Override
    public Product save(Object object) {
        return null;
    }

    @Override
    public Product update(Object object) {
        return null;
    }

    @Override
    public Product[] getAll() {
        return new Product[0];
    }

    @Override
    public Object getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
