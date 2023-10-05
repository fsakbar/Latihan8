package com.genericarraylist;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("Name " + this.name + " health " + this.health);
    }

    void setName(String new_name){
        this.name = new_name;
    }
}
