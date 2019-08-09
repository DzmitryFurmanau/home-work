package com.autoPartsStore.app.dao;

import java.util.Collection;
import java.util.Optional;

public interface GenericDao<T> {
    Optional<T> save(T t);

    Optional<T> update(T t);

    Collection<T> getAll();

    Optional<T> getById(Long id);

    void delete(T t);

    void deleteAll();

    void deleteById(Long id);
}