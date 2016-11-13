package org.hfpd.Factory;

/**
 * Created by yuhzheng on 11/12/16.
 */
public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
