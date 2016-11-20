package org.hfpd.Adapter;

/**
 * Created by yuhzheng on 11/19/16.
 */
public class WildTurkey implements Turkey {
    public void gobble(){
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
