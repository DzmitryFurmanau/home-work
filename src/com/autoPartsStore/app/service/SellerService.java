package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Seller;

import java.util.Optional;

public interface SellerService extends EmployeeService<Seller> {

    Optional<Seller> getByCategory(Integer category);
}