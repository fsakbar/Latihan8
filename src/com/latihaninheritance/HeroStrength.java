package com.latihaninheritance;

public class HeroStrength extends Hero{
    String type = "Strength";

    // Constructor
    HeroStrength(String nameInput, double attackInput, double healtInput){
        super(nameInput, attackInput, healtInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : " + this.type);
    }


    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receive half damage " + damage + " -> " + 0.5*damage);
        this.health -= 0.5*damage;
    }

}
