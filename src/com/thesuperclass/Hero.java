package com.thesuperclass;

public class Hero extends Object{
    private String name;
    public Hero(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("\nName: " + this.name);
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){
            System.out.println("Object dengan reference sama");
            return true;
        }  else if(this.getClass() == otherObject.getClass()){
            System.out.println("Object dengan class sama namu reference");
            return true;
        } else {
            System.out.println("Reference berbeda");
            return false;
        }
    }
}
