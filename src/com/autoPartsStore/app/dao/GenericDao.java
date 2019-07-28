package com.autoPartsStore.app.dao;

import java.util.Collection;

import java.util.Optional;
import java.util.function.Supplier;

public interface GenericDao<T> {

    Optional<T> save(T object);

    Optional<T> update(T object);

    Collection<T> getAll();

    Supplier<T> getByName(String Name);

    void delete(T object);

    void deleteAll();

    void deleteByName(String Name);
}
