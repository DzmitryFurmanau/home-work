package com.autoPartsStore.app.domain;

public class Heaver extends Employee {

    private Integer bonus;

    public Heaver(String name, Integer age, Integer salary, Integer bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public Heaver() {
        super();
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
