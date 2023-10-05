package com.thesuperclass;

public class Main {
    public static void main(String [] args){
        Hero hero1 = new Hero("UCup");

        hero1.display();

        //Object
        Object hero2 = hero1;
        Object hero2_str = hero2.toString(); // diubah ke string referensi

        System.out.println(hero1.equals(hero2));
        //akan mengeluarkan referensi
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero2_str);


        //method di dalam object adalah equals
        System.out.println(hero1.equals(hero2_str));


        //melihat method Object
        //hero1.
    }
}
