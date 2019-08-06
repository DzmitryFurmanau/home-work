package main.java.autoPartsStore.service.impl;

import main.java.autoPartsStore.dao.HeaverDao;
import main.java.autoPartsStore.dao.impl.HeaverDaoImpl;
import main.java.autoPartsStore.domain.Heaver;
import main.java.autoPartsStore.service.HeaverService;

import java.util.Optional;
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
    public Optional<Heaver> getByBonus(Integer bonus) {
        return heaverDao.getByBonus(bonus);
    }

    @Override
    public boolean fire(Heaver heaver) {
        //add some logic
        heaverDao.delete(heaver);
        return true;
    }

    @Override
    public boolean hire(Heaver heaver) {
        //add some logic
        heaverDao.save(heaver);
        return true;
    }

    @Override
    public boolean promote(Heaver heaver) {
        //add some logic
        heaverDao.update(heaver);
        return true;
    }

    @Override
    public Optional<Heaver> save(Heaver heaver) {
        return heaverDao.save(heaver);
    }

    @Override
    public Optional<Heaver> update(Heaver heaver) {
        return heaverDao.update(heaver);
    }

    @Override
    public Set<Heaver> getAll() {
        return heaverDao.getAll();
    }

    @Override
    public Optional<Heaver> getById(Long id) {
        return heaverDao.getById(id);
    }

    @Override
    public void delete(Heaver heaver) {
        heaverDao.delete(heaver);
    }

    @Override
    public void deleteAll() {
        heaverDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        heaverDao.deleteById(id);
    }
}