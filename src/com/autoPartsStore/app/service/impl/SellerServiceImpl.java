package com.autoPartsStore.app.service.impl;

import com.autoPartsStore.app.dao.SellerDao;
import com.autoPartsStore.app.dao.impl.SellerDaoImpl;
import com.autoPartsStore.app.domain.Seller;
import com.autoPartsStore.app.service.SellerService;

import java.util.Set;

public class SellerServiceImpl implements SellerService {

    private static SellerService instance;

    private SellerDao sellerDao = SellerDaoImpl.getInstance();

    private SellerServiceImpl() {

    }

    public static SellerService getInstance() {
        if (instance == null) {
            instance = new SellerServiceImpl();
        }
        return instance;
    }

    @Override
    public Seller getByCategory(Integer category) {
        return null;
    }

    @Override
    public boolean fire(Seller employee) {
        return false;
    }

    @Override
    public boolean hire(Seller employee) {
        return false;
    }

    @Override
    public boolean promote(Seller employee) {
        return false;
    }

    @Override
    public Seller save(Seller object) {
        return null;
    }

    @Override
    public Seller update(Seller object) {
        return null;
    }

    @Override
    public Set<Seller> getAll() {
        return null;
    }

    @Override
    public Seller getByName(String name) {
        return null;
    }

    @Override
    public void delete(Seller object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}