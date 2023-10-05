package com.protectedkeyword.Hero;

public abstract class Hero {
    private String name;// ini hanya bisa diakses oleh subclass dari Hero
    private int level;

    public Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public abstract void display();

    protected String getName(){
        String str = "Name : " + this.name +  "-" + this.level;
        return str;
    }

    protected void setName(String name){
        this.name = name;
    }

    // karena pakai protected bisa diakses subclass maka
}
