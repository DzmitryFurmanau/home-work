package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.HeaverDao;
import com.autoPartsStore.app.domain.Heaver;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

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
        return Optional.empty();
    }

    @Override
    public Optional<Heaver> save(Heaver object) {
        return Optional.empty();
    }

    @Override
    public Optional<Heaver> update(Heaver object) {
        return Optional.empty();
    }

    @Override
    public Set<Heaver> getAll() {
        return new HashSet<>();
    }

    @Override
    public Supplier<Heaver> getByName(String Name) {
        return Heaver::new;
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
