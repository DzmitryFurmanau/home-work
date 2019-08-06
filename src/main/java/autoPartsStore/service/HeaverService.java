package main.java.autoPartsStore.service;

import main.java.autoPartsStore.domain.Heaver;

import java.util.Optional;

public interface HeaverService extends EmployeeService<Heaver> {

    Optional<Heaver> getByBonus(Integer bonus);
}