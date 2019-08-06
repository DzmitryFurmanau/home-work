package main.java.autoPartsStore.dao.impl;

import main.java.autoPartsStore.dao.HeaverDao;
import main.java.autoPartsStore.domain.Heaver;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class HeaverDaoImpl extends GenericDaoImpl<Heaver> implements HeaverDao {

    private static HeaverDao instance;

    private HeaverDaoImpl() {
        super(Heaver.class, (o) -> {
            Heaver heaver = null;
            if (o instanceof Heaver) {
                heaver = (Heaver) o;
            }
            return heaver;
        });
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
    public Set<Heaver> getAll() {
        return new HashSet<>(super.getAll());
    }
}