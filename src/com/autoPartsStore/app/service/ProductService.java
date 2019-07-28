package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Product;

import java.util.List;
import java.util.function.Predicate;

public interface ProductService extends GenericService<Product> {

    List<Product> getByPrice(Double price);

    Predicate<Product> sale(Integer count);
}
