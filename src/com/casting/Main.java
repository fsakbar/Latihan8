package com.casting;

public class Main {
    public static void main(String [] args){
        //casting
        double angka = 5.4;
        int angka_int = (int) angka;
        System.out.println(angka_int);


        // object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        //casting hero1 menjadi Hero
        //up casting
        Hero heroUp1 = (Hero) hero1;
        heroUp1.display(); //attribute dan methdo intel hilang namun bisa diakses lewat display?


        Hero heroReg = new Hero("Otong", 100);
        heroReg.display();

//        HeroAgility heroDown = (HeroAgility) heroReg;
//        heroDown.display();

        HeroIntel hero2 = (HeroIntel) heroUp1;

        hero2.display();


    }
}
