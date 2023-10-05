package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
       Player player1 = new Player("Saitama");
       Player player2 = new Player();
       Player player3 = new Player();


       player1.show();
       player2.show();
       player3.show();

       // overloading method
        int a = Matematika.tambah(1 , 19);
        System.out.println(a);
        double b = Matematika.tambah(1.1, 2.4);
        System.out.println(b);
    }
}