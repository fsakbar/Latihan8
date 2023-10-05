package com.latihaninheritance;

public class Main {
    public static void main(String[]args){
        Hero hero1 = new Hero("Miya", 10, 100);
        HeroStrength hero2 = new HeroStrength("Tigreal", 5, 150);
        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();

    }
}
