package com.example.demo2.Menu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
    @Id
    private int id;
    private String name;
    private double price;
    private String description;


    public Menu() {
    }

    public Menu(int id, String Name, double price, String description) {
        this.id = id;
        this.name = Name;
        this.price = price;
        this.description = description;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
