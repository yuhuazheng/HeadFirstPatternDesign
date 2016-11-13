package org.hfpd.Factory;

import java.util.ArrayList;

/**
 * Created by yuhzheng on 11/12/16.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings ...");
        for(int i=0;i<toppings.size();i++)
            System.out.println(toppings.get(i));
    }

    void bake(){
        System.out.println("Bake for 25 mins at 350");
    }

    void cut(){
        System.out.println("Cutting pizza");
    }

    void box(){
        System.out.println("Putting pizza into box");
    }

    public String getName(){
        return name;
    }
}
