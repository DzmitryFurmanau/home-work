package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Product;

public interface ProductService extends GenericService{

    Product[] getByPrice(Double price);

    Product sale(Integer count);
}
