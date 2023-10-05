package com.superinheritance;

// this.name akan mengakses atribut name kalau ada di kelas ini
// jika tidak ada maka kaan mengakses atribut name dari superclass

//super.name akan selalu mengakses atribute superclass
public class HeroStrength extends Hero{
    String name = "Class Strength";
    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah Super " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini ada di subclass");
    }
}
