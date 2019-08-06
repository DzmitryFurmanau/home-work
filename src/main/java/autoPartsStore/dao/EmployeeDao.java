package main.java.autoPartsStore.dao;

import main.java.autoPartsStore.domain.Employee;

import java.util.Set;

public interface EmployeeDao<T extends Employee> extends GenericDao<T> {
    @Override
    Set<T> getAll();
}