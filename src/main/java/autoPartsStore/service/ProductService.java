package main.java.autoPartsStore.service;

import main.java.autoPartsStore.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService extends GenericService<Product> {

    List<Product> getByPrice(Double price);

    Optional<Product> sale(Product product, Integer count);
}