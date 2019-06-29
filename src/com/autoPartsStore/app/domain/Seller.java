package com.autoPartsStore.app.domain;

public class Seller extends Employee {
    private Integer category;

    public Seller(String name, Integer age, Integer salary, Integer category) {
        super(name, age, salary);
        this.category = category;
    }

    public Seller() {
        super();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

}
