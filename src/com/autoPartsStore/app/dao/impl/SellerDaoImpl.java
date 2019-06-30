package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.SellerDao;
import com.autoPartsStore.app.domain.Seller;

public class SellerDaoImpl implements SellerDao {

    private static SellerDao instance;

    private SellerDaoImpl() {

    }

    public static SellerDao getInstance() {
        if (instance == null) {
            instance = new SellerDaoImpl();
        }
        return instance;
    }

    @Override
    public Seller getByCategory(Integer category) {
        return null;
    }

    @Override
    public Seller save(Object object) {
        return null;
    }

    @Override
    public Seller update(Object object) {
        return null;
    }

    @Override
    public Seller[] getAll() {
        return new Seller[0];
    }

    @Override
    public Seller getByName(String name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
