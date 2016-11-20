package org.hfpd.TemplateMethod;

/**
 * Created by yuhzheng on 11/19/16.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(userWantsCondiments())
            addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring");
    }

    boolean userWantsCondiments(){
        return true;
    }
}
