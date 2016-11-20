package org.hfpd.TemplateMethod;

/**
 * Created by yuhzheng on 11/19/16.
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        bewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void bewCoffeeGrinds(){
        System.out.println("Dripping some coffee");
    }

    public void pourInCup(){
        System.out.println("Pouring");
    }

    public void addSugarAndMilk(){
        System.out.println("Adding sugar and milk");
    }
}
