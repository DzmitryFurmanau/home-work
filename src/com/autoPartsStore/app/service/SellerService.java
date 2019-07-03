package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Seller;

public interface SellerService extends EmployeeService {

    Seller getByCategory(Integer category);
}
