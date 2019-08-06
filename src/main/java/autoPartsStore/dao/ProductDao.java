package main.java.autoPartsStore.dao;

import main.java.autoPartsStore.domain.Product;

import java.util.List;

public interface ProductDao extends GenericDao<Product> {

    List<Product> getByPrice(Double price);
}
