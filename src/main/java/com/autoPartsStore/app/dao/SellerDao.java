package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Seller;

import java.util.Optional;

public interface SellerDao extends EmployeeDao<Seller> {
    Optional<Seller> getByCategory(Integer category);
}