package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao extends GenericDao<Product> {

    List<Product> getByPrice(Double price);

    Optional<Product> sale(Integer count);
}
