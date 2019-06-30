package com.autoPartsStore.app.service.impl;

import com.autoPartsStore.app.dao.ProductDao;
import com.autoPartsStore.app.dao.impl.ProductDaoImpl;
import com.autoPartsStore.app.domain.Product;
import com.autoPartsStore.app.service.ProductService;


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
    public Product[] getByPrice(Double price) {
        return productDao.getByPrice(price);
    }

    @Override
    public Product sale(Integer count) {
        return null;
    }

    @Override
    public Object save(Object object) {
        return productDao.save(object);
    }

    @Override
    public Object update(Object object) {
        return productDao.update(object);
    }

    @Override
    public Object[] getAll() {
        return productDao.getAll();
    }

    @Override
    public Object getByName(String name) {
        return productDao.getByName(name);
    }

    @Override
    public void delete(Object object) {
        productDao.delete(object);
    }

    @Override
    public void deleteAll() {
        productDao.deleteAll();

    }

    @Override
    public void deleteByName(String name) {
        productDao.deleteByName(name);

    }
}
