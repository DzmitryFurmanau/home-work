package main.java.autoPartsStore.dao.impl;

import main.java.autoPartsStore.dao.ProductDao;
import main.java.autoPartsStore.domain.Product;

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