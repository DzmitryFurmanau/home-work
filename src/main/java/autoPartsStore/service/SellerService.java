package main.java.autoPartsStore.service;

import main.java.autoPartsStore.domain.Seller;

import java.util.Optional;

public interface SellerService extends EmployeeService<Seller> {

    Optional<Seller> getByCategory(Integer category);
}