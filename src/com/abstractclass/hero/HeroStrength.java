package com.abstractclass.hero;

public class HeroStrength extends Hero{

    public HeroStrength(String name) {
        super(name);
    }

    @Override
    public void levelUp() {
        setLevel(1);
    }
}
