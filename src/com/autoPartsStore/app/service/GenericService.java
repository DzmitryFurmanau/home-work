package com.autoPartsStore.app.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

public interface GenericService<T> {

    Optional<T> save(T object);

    Optional<T> update(T object);

    Collection<T> getAll();

    Supplier<T> getByName(String name);

    void delete(T object);

    void deleteAll();

    void deleteByName(String name);
}
