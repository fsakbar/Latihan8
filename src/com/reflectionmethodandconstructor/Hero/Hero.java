package com.reflectionmethodandconstructor.Hero;

public abstract class Hero {
    private String name;
    private double health;
    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health);
    }



}
