package com.abstractclass.hero;

//abstract class
public abstract class Hero {
    public String name;
    private int level;

    public Hero (String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println( this.name + " Adalah Hero");
        System.out.println( "Level" + this.level);
    }

    // abstract method cannot have body
    public abstract void levelUp();

    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }

}
