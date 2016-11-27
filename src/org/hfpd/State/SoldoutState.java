package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class SoldoutState implements State {
    GumballMachine gumballMachine;

    public SoldoutState(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void insertQuater() {
        System.out.println("sold out");
    }

    @Override
    public void ejectQuater() {
        System.out.println("sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("sold out");
    }

    @Override
    public void dispense() {
        System.out.println("sold out");
    }
}
