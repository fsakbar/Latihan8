package com.abstractclass;
import com.abstractclass.hero.Hero;
import com.abstractclass.hero.HeroIntel;
import com.abstractclass.hero.HeroAgility;
import com.abstractclass.hero.HeroStrength;


public class Main {
    public static void main(String [] args){
        // Membuat object dari kelas non-abstract
        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();

        // Membuat object dari kelas abstract tidak bisa dilakukan
        // Hero hero2 = new Hero("Mario");
        // hero2.display();
        HeroStrength hero2 = new HeroStrength("Tigreal");
        hero2.display();

        HeroAgility hero3 = new HeroAgility("Mina");
        hero3.display();

        hero1.levelUp();
        hero2.levelUp();
        hero3.levelUp();

        hero1.display();
        hero2.display();
        hero3.display();


    }
}
