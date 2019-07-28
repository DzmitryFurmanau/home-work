package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Product;

import java.util.List;
import java.util.function.Predicate;

public interface ProductDao extends GenericDao<Product> {

    List<Product> getByPrice(Double price);

    Predicate<Product> sale(Integer count);
}
