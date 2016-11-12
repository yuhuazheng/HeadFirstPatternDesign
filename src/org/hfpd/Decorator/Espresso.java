package org.hfpd.Decorator;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
