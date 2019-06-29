package com.autoPartsStore.app.dao;


import com.autoPartsStore.app.domain.Seller;

public interface SellerDao extends GenericDao {

    Seller getByCategory(Integer category);
}
