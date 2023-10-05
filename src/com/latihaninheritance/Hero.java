package com.latihaninheritance;

public class Hero {
    //attribute
    String name;
    double attackPower, health;
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    //method attack
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    };

    void display(){
        System.out.println("\nNames: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Attack Power: " + this.attackPower);
    }

}
