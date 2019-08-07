package com.autoPartsStore.app.domain;

import com.autoPartsStore.app.annotation.FileStorage;

import java.io.Serializable;

@FileStorage(name = "Product")
public class Product extends BaseEntity implements Serializable {
    private Long id;
    private String name;
    private Integer count;
    private Double price;

    public Product() {

    }

    public Product(Long id, String name, Integer count, Double price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count='" + count + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}