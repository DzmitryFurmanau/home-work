package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Product;

public interface ProductDao extends GenericDao {

    Product[] getByPrice(Double price);
}
