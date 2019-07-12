package com.autoPartsStore.app.service.impl;

import com.autoPartsStore.app.dao.HeaverDao;
import com.autoPartsStore.app.dao.impl.HeaverDaoImpl;
import com.autoPartsStore.app.domain.Heaver;
import com.autoPartsStore.app.service.HeaverService;

import java.util.Set;

public class HeaverServiceImpl implements HeaverService {

    private static HeaverService instance;

    private HeaverDao heaverDao = HeaverDaoImpl.getInstance();

    private HeaverServiceImpl() {

    }

    public static HeaverService getInstance() {
        if (instance == null) {
            instance = new HeaverServiceImpl();
        }
        return instance;
    }


    @Override
    public Heaver getByBonus(Integer bonus) {
        return null;
    }

    @Override
    public boolean fire(Heaver employee) {
        return false;
    }

    @Override
    public boolean hire(Heaver employee) {
        return false;
    }

    @Override
    public boolean promote(Heaver employee) {
        return false;
    }

    @Override
    public Heaver save(Heaver object) {
        return null;
    }

    @Override
    public Heaver update(Heaver object) {
        return null;
    }

    @Override
    public Set<Heaver> getAll() {
        return null;
    }

    @Override
    public Heaver getByName(String name) {
        return null;
    }

    @Override
    public void delete(Heaver object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
