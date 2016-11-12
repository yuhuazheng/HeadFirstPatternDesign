package org.hfpd.Decorator;

/**
 * Created by yuhzheng on 11/12/16.
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
