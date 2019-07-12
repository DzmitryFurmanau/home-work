package com.autoPartsStore.app.service;

import com.autoPartsStore.app.domain.Heaver;

public interface HeaverService extends EmployeeService<Heaver> {

    Heaver getByBonus(Integer bonus);
}
