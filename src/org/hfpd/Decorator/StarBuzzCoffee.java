package org.hfpd.Decorator;

/**
 * Created by yuhzheng on 11/12/16.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage b = new Espresso();
        System.out.println(b.getDescription() + " $" + b.cost());

        Beverage b2 = new Mocha(b);
        System.out.println(b2.getDescription() + " $" + b2.cost());

        Beverage b3 = new Whip(b2);
        System.out.println(b3.getDescription() + " $" + b3.cost());

        Beverage b4 = new HouseBlend();
        System.out.println(b4.getDescription() + " $" + b4.cost());
        Beverage b5 = new Mocha(b4);
        System.out.println(b5.getDescription() + " $" + b5.cost());
        Beverage b6 = new Whip(b5);
        System.out.format("%s $%-5.2f", b6.getDescription(), b6.cost());
    }
}
