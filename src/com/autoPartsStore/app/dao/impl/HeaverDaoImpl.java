package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.HeaverDao;
import com.autoPartsStore.app.domain.Heaver;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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
    public Optional<Heaver> getByBonus(Integer bonus) {
        return empty();
    }

    @Override
    public Optional<Heaver> save(String path, Heaver object) {
        return empty();
    }

    @Override
    public Optional<Heaver> update(Heaver object) {
        return empty();
    }

    @Override
    public Set<Heaver> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Heaver>  getByName(String Name) {
        return empty();
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