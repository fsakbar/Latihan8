package com.reflectionmethodandconstructor.Hero;

public class HeroAgility extends Hero {
    private String heroType = "Agility";
    private String nickname;

    public HeroAgility(String name, double health){
        super(name, health);
    }


    public void displayAll() {
        super.display();
        System.out.println("HeroType : " + this.heroType);
        System.out.println("Nicname : " + this.nickname);
    }

    private void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    private void setNickName(String nickname){
        this.nickname = nickname;
    }
}
