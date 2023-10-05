package com.subclassconstructor;

//subclass


public class Main {
    public static void main(String[]args){
        Hero hero1 = new Hero("Esmeralda"); // Menggunakan Constructor SuperClass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Mega");
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Otong", 12);
        hero3.display();
    }
}
