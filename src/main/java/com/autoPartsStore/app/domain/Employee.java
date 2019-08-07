package com.autoPartsStore.app.domain;

import java.io.Serializable;

abstract public class Employee extends BaseEntity implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private Integer salary;

    Employee() {

    }

    Employee(Long id, String name, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}