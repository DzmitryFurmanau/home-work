package com.autoPartsStore.app.domain;

public class Seller extends Employee {
    private Integer category;

    public Seller(Long id, String name, Integer age, Integer salary, Integer category) {
        super(id, name, age, salary);
        this.category = category;
    }

    public Seller() {
        super();
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", category=" + getCategory() +
                '}';
    }

    private Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}