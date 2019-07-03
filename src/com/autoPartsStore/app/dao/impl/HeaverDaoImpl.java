package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.HeaverDao;
import com.autoPartsStore.app.domain.Heaver;

public class HeaverDaoImpl implements HeaverDao {

    private static HeaverDao instance;

    private HeaverDaoImpl() {

    }

    public static HeaverDao getInstance() {
        if (instance == null) {
            instance = new HeaverDaoImpl();
        }
        return instance;
    }

    @Override
    public Heaver getByBonus(Integer bonus) {
        return null;
    }

    @Override
    public Heaver save(Object object) {
        return null;
    }

    @Override
    public Heaver update(Object object) {
        return null;
    }

    @Override
    public Heaver[] getAll() {
        return new Heaver[0];
    }

    @Override
    public Heaver getByName(String Name) {
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
