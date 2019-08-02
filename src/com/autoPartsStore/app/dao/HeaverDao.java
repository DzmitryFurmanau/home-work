package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Heaver;

import java.util.Optional;

public interface HeaverDao extends EmployeeDao<Heaver> {

    Optional<Heaver> getByBonus(Integer bonus);
}