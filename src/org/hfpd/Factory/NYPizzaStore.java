package org.hfpd.Factory;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class NYPizzaStore extends PizzaStore {

     protected  Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYCheesePizza();
        }
        else if(type.equals("veggie")){
            return new NYVeggiePizza();
        }
        else
            return null;
    }
}
