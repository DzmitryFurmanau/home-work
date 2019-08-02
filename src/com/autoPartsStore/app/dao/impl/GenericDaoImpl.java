package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.GenericDao;
import com.autoPartsStore.app.domain.BaseEntity;

import java.util.Collection;
import java.util.Optional;

//TODO rename class and make it as util
public class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    @Override
    //TODO generate ID autoincrement
    public Optional<T> save(String path, T object) {
        //TODO
        //1. Add read from file
        //2. check if exist by name
        //3. generate ID
        //4. add to collection
        //collection.add
        //5. write collection to file

        return Optional.ofNullable(object);
    }

    @Override
    public Optional<T> update(T object) {
        return Optional.empty();
    }

    @Override
    public Collection<T> getAll() {
        return null;
    }

    @Override
    public Optional<T> getByName(String Name) {
        return Optional.empty();
    }

    @Override
    public void delete(T object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}