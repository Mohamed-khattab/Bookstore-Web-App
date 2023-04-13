package com.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "myboks")
public class MyBookList {
    @Id
    private int id ;
    private  String author ;
    private String name ;
    private float price ;

    public MyBookList(int id, String author, String name, float price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public MyBookList() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
