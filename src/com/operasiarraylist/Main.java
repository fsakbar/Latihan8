package com.operasiarraylist;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        System.out.println("test");
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 120);
        AgilityHero hero3 = new AgilityHero("Miya", 50);
        IntelHero hero4 = new IntelHero("John", 20);

        ArrayList<Hero> listHero = new ArrayList<>();


        //  Operasi 1: menambah member dengan add
        System.out.println("Operasi 1: add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);

        System.out.println(listHero);
        for(Hero hero: listHero){
            System.out.println(hero);
        }

        // Operasi 2: mengubah member dengan set // yang penting objectnya sama // jika belum keisi maka dia akan error
        System.out.println("\nOperasi 2: set");
        listHero.set(1, hero3);
        System.out.println(listHero);
        for(Hero hero: listHero){
            System.out.println(hero);
        }

        // Operasi 3: menghapus member dengan remove //
        System.out.println("\n Operasi 3: set");
        listHero.remove(0);
        System.out.println(listHero);
        for(Hero hero: listHero){
            System.out.println(hero);
        }

        // Operasi 4: mengakses member
        System.out.println("\n Operasi 4: get");
        Hero heroAmbil = listHero.get(0);
        System.out.println(listHero);
        for(Hero hero: listHero){
            System.out.println(hero);
        }
        heroAmbil.display();


        // method pada arraylist
        System.out.println("\nmethod pada ArrayList");
        System.out.println("1. size()\t\t\t" + listHero.size());
        System.out.println("2. isEmpty()\t\t" + listHero.isEmpty());
        System.out.println("3. containts(hero1)\t" + listHero.contains(hero1));
        System.out.println("3. containts(hero2)\t" + listHero.contains(hero3));
        System.out.println("4. indexOf(hero1)\t" + listHero.indexOf(hero1));
        System.out.println("4. indexOf(hero2)\t" + listHero.indexOf(hero3));
    }
}
