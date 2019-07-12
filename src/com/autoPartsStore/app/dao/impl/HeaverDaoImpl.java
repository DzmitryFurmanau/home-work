package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.HeaverDao;
import com.autoPartsStore.app.domain.Heaver;

import java.util.Collection;

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
    public Heaver save(Heaver object) {
        return null;
    }

    @Override
    public Heaver update(Heaver object) {
        return null;
    }

    @Override
    public Collection<Heaver> getAll() {
        return null;
    }

    @Override
    public Heaver getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Heaver object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
