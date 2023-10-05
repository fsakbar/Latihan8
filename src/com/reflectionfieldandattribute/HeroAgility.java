package com.reflectionfieldandattribute;

public class HeroAgility extends Hero{
    public String nickname;
    private String HeroType = "Agility";

    public HeroAgility(String name, double health){
        super(name, health);
    }

    public void displayAll(){
        this.display();
        System.out.println("HeroType: " + this.HeroType);
        System.out.println("Nickname: " + this.nickname);
    }
}
