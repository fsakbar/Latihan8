package com.reflectionmethodandconstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import com.reflectionmethodandconstructor.Hero.Hero;
import com.reflectionmethodandconstructor.Hero.HeroAgility;
public class Main {
    public static void main(String [] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        HeroAgility hero1 = new HeroAgility("Ucup", 100);
        hero1.displayAll();

        // Teknik Reflection
        System.out.println("\nMenjadi\n");
        System.out.println("Memanggil Private Method");
        Method[] methodHero = hero1.getClass().getDeclaredMethods();
        for(Method method:methodHero){
            if (method.getName().equals("setHeroType")){
                System.out.println("Menginvoke method setHeroType");
                method.setAccessible(true);
                method.invoke(hero1, "Intel");
            }
            if (method.getName().equals("setNickName")){
                System.out.println("Menginvoke method setNickName");
                method.setAccessible(true);
                method.invoke(hero1, "CapCipCup");
            }
        }
        hero1.displayAll();

        // Ingin Mengakses Constructor
        Object newHero = new Object();

        Constructor<?>[] constructorHero = hero1.getClass().getConstructors();

        for(Constructor<?> constructor: constructorHero){
            System.out.println(constructor.getName());
            if(constructor.getName().equals("com.reflectionmethodandconstructor.Hero.HeroAgility")){
                Object[] obj = {"James", 20};
                newHero = constructor.newInstance(obj);
            }

        }
        // Karena new Hero Tipe Datanya Object maka kita dapat casting ke HeroAgility
        HeroAgility hero2 = (HeroAgility) newHero;
        hero2.displayAll();

    }
}
