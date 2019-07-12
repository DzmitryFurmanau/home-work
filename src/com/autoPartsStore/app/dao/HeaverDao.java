package com.autoPartsStore.app.dao;

import com.autoPartsStore.app.domain.Heaver;

public interface HeaverDao extends GenericDao<Heaver> {

    Heaver getByBonus(Integer bonus);
}
