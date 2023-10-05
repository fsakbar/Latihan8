package com.tutorial;

public class Player {
    private String name;
    private static  int jumlahPlayer;

    // overloading constructor
    //opsi 2
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }
    Player(){
        Player.jumlahPlayer++;
        this.name = "Player" + jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }





}
