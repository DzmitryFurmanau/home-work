package com.autoPartsStore.app.service;

import java.util.Collection;

public interface GenericService<T> {

    T save(T object);

    T update(T object);

    Collection<T> getAll();

    T getByName(String name);

    void delete(T object);

    void deleteAll();

    void deleteByName(String name);
}
