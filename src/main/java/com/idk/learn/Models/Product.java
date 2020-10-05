package com.idk.learn.Models;

import javax.persistence.*;

@Entity
@Table(name="\"my_items\"")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String name;
    private String desc;
    private Double price;

    public Product(){}

    public Product(String name, String desc, Double price) {
        this.desc = desc;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
