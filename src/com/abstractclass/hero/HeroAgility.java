package com.abstractclass.hero;

public class HeroAgility extends Hero{

    public HeroAgility(String name){
        super(name);
    }

    public void levelUp(){
        setLevel(1);
    }
}
