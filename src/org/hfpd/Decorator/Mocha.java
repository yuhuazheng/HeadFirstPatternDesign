package org.hfpd.Decorator;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage b){
        beverage = b;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + 0.20;
    }
}
