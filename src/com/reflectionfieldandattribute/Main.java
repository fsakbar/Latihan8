package com.reflectionfieldandattribute;

import java.lang.reflect.Field; //library java.

public class Main {
    public static void main(String [] args) throws IllegalAccessException {
        System.out.println("Test");
        HeroAgility hero1 = new HeroAgility("Otong", 100);
        hero1.displayAll();

        //access modifier
        hero1.nickname = "Tong Tong";
        hero1.displayAll();


        //Reflection
        // Mengambil Class dari object hero1
        Class<?> classHero1 = hero1.getClass();
        System.out.println("\nclass: "+classHero1.getName());
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
        System.out.println("\nsuperclass: "+parentClassHero1.getName());

        // cek attribute dari object hero1
        System.out.println("\nattribute dari object hero1");
        Field[] hero1Fields = classHero1.getFields();
        System.out.println("\n Jumalh attribute adalah " + hero1Fields.length);
        System.out.println("\n attribute " + hero1Fields[0].getName());

        //cek attribute semua object hero1
        System.out.println("\nattribute dari object hero1");
        Field[] heroAllFields = classHero1.getDeclaredFields();
        System.out.println("\n Jumalh attribute adalah " + heroAllFields.length);
        for(Field field: heroAllFields){
            System.out.println(field.getName());
        }

        // parentclass
        System.out.println("\nattribute dari object hero1");
        Field[] parentHeroAllFields = parentClassHero1.getDeclaredFields();
        System.out.println("\n Jumalh attribute adalah " + parentHeroAllFields.length);
        for(Field field: parentHeroAllFields){
            System.out.println(field.getName());
        }

        // kita ubah nilainya dengan reflection
        System.out.println("\n Kita ubah ");
        hero1.displayAll();;
        System.out.println("\nMenjadi:");
        heroAllFields[0].set(hero1, "TingTIng");
        // merubah private
        heroAllFields[1].setAccessible(true);
        heroAllFields[1].set(hero1, "Intel" );// Hanya bisa diubah lewat reflection
        hero1.displayAll();


        // Ubah bagian superclass
        parentHeroAllFields[0].setAccessible(true);
        parentHeroAllFields[1].setAccessible(true);
        parentHeroAllFields[0].set(hero1, "UCUP");
        parentHeroAllFields[1].set(hero1, 0);
        hero1.displayAll();




    }
}
