package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.ProductDao;
import com.autoPartsStore.app.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {

    private static ProductDao instance;

    private ProductDaoImpl() {
        super(Product.class, (o) -> {
            Product product = null;
            if (o instanceof Product) {
                product = (Product) o;
            }
            return product;
        });
    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return new ArrayList<>();
    }
}