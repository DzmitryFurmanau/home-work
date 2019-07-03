package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Employee;

public interface EmployeeService extends GenericService {

    boolean fire(Employee employee);

    boolean hire(Employee employee);

    boolean promote(Employee employee);

}
