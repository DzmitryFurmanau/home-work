package com.autoPartsStore.app.domain;

import com.autoPartsStore.app.annotation.FileStorage;

@FileStorage(name = "Heaver")

public class Heaver extends Employee {
    private Integer bonus;

    public Heaver(Long id, String name, Integer age, Integer salary, Integer bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public Heaver() {
        super();
    }

    @Override
    public String toString() {
        return "Heaver{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus() +
                '}';
    }

    private Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}