package com.protectedkeyword.Hero;

public class HeroStrength extends Hero{

    public HeroStrength(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Hero Strength with " + this.getName() );
    }

    public void setName(String name){
        super.setName(name);
    }
}
