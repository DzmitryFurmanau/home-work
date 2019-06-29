package com.autoPartsStore.app.service;

public interface GenericService {

    Object save(Object object);

    Object update(Object object);

    Object[] getAll();

    Object getByName(String name);

    void delete(Object object);

    void deleteAll();

    void deleteByName(String name);
}
