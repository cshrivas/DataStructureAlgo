package com.cs.hr.stackQueue;

import java.util.Objects;

public abstract class Animal {
    private int order;
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "order=" + order +
                ", name='" + name + '\'' +
                '}';
    }

}
