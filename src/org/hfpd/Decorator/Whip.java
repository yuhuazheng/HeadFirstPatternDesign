package org.hfpd.Decorator;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage b){
        beverage = b;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return beverage.cost() + 0.1;
    }
}
