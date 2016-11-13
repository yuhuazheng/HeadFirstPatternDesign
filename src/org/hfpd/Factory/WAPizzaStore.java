package org.hfpd.Factory;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class WAPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new WACheesePizza();
        }
        else if(type.equals("veggie")){
            return new WAVeggiePizza();
        }
        else
            return null;
    }
}
