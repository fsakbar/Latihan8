package com.inheritance;

// Inheritance adalah hubungan is-a


//Superclass, parentclass, baseclass
class  Hero{
    String name;
}

//subclass, childclass derivedclass
class HeroStrength extends Hero{

}

class HeroIntelligence extends  Hero{

}
public class Main {
    public static void main(String[] args){
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Miya";
        System.out.println(hero2.name);
    }
}
