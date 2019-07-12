package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Seller;

public interface SellerService extends EmployeeService<Seller> {

    Seller getByCategory(Integer category);
}
