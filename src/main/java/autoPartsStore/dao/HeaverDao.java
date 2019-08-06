package main.java.autoPartsStore.dao;

import main.java.autoPartsStore.domain.Heaver;

import java.util.Optional;

public interface HeaverDao extends EmployeeDao<Heaver> {

    Optional<Heaver> getByBonus(Integer bonus);
}