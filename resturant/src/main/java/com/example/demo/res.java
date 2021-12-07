package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class res {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private String name;
    private Long Price;
    private String description;


    public res() {
    }
    public res(Long id, String name, Long price, String description) {
        this.id = id;
        this.name = name;
        Price = price;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

        @Override
        public String toString() {
            return "Restaurant{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", Price=" + Price +
                    ", description='" + description + '\'' +
                    '}';


    }
}
