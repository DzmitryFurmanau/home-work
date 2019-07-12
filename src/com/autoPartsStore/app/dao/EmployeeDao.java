package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Employee;

import java.util.Set;

public interface EmployeeDao<T extends Employee> extends GenericDao<T> {
    @Override
    Set<T> getAll();
}
