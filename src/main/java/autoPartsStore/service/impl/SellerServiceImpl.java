package main.java.autoPartsStore.service.impl;

import main.java.autoPartsStore.dao.SellerDao;
import main.java.autoPartsStore.dao.impl.SellerDaoImpl;
import main.java.autoPartsStore.domain.Seller;
import main.java.autoPartsStore.service.SellerService;

import java.util.Optional;
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
    public Optional<Seller> getByCategory(Integer category) {
        return sellerDao.getByCategory(category);
    }

    @Override
    public boolean fire(Seller seller) {
        //add some logic
        sellerDao.delete(seller);
        return true;

    }

    @Override
    public boolean hire(Seller seller) {
        //add some logic
        sellerDao.save(seller);
        return true;
    }

    @Override
    public boolean promote(Seller seller) {
        //add some logic
        sellerDao.update(seller);
        return true;
    }

    @Override
    public Optional<Seller> save(Seller seller) {
        return sellerDao.save(seller);
    }

    @Override
    public Optional<Seller> update(Seller seller) {
        return sellerDao.update(seller);
    }

    @Override
    public Set<Seller> getAll() {
        return sellerDao.getAll();
    }

    @Override
    public Optional<Seller> getById(Long id) {
        return sellerDao.getById(id);
    }

    @Override
    public void delete(Seller seller) {
        sellerDao.delete(seller);
    }

    @Override
    public void deleteAll() {
        sellerDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        sellerDao.deleteById(id);
    }
}