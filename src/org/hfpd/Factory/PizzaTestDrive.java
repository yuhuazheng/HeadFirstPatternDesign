package org.hfpd.Factory;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore waStore = new WAPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = waStore.orderPizza("veggie");
        System.out.println(pizza.getName());
    }
}
