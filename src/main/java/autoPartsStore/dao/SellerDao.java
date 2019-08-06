package main.java.autoPartsStore.dao;

import main.java.autoPartsStore.domain.Seller;

import java.util.Optional;

public interface SellerDao extends EmployeeDao<Seller> {

    Optional<Seller> getByCategory(Integer category);
}