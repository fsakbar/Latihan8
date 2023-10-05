package com.genericarraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        System.out.println("Test");
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Miya", 80);
        AgilityHero hero3 = new AgilityHero("Tigreal", 200);
        IntelHero hero4 = new IntelHero("Jhon", 200);

        //Array
        Hero[] kumpulanHero = new Hero[4];

        //Masukan Anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;
        // kumpulanHero[4] tidak bisa karena ini array fix


        // fornya menginisialisasi class hero mengubahnya ke object hero dan memberikan kumpulanHero.
//        for (Hero hero: kumpulanHero){
//            hero.display();
//        }

        // Array List
        System.out.println("\n Array List");
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);
        for (Hero hero: listHero){
            hero.display();
        }

        System.out.println("\n Setelah Diganti");
        hero3.setName("Dudung");
        for (Hero hero: listHero){
            hero.display();
        }
    }
}
