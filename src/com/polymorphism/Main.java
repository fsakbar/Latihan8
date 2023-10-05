package com.polymorphism;

public class Main {
    public static void main(String [] args){
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Tigreal");
        hero1.display();
        hero2.display();


        // Polymorphic
        // Membuat tipe data Hero namun Object adalah HeroStrength
        Hero hero3 = new HeroAgility("X-Borg");
        hero3.display();


        // Ini Tidak Bisa
//        HeroIntel hero4 = new Hero("Natalia");
//        hero4.display();

        HeroAgility hero4 = new HeroAgility("Karina");
        hero4.display();
        hero4.showOff();

        //Fungsinya
        // Membuat Array List
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;
        
    }

}
