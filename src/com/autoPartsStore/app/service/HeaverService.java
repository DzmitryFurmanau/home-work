package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Heaver;

import java.util.Optional;

public interface HeaverService extends EmployeeService<Heaver> {

    Optional<Heaver> getByBonus(Integer bonus);
}
