package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class SoldState implements State {
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void insertQuater() {
        System.out.println("wait for this transaction to finish");
    }

    @Override
    public void ejectQuater() {
        System.out.println("sorry, no taking back");
    }

    @Override
    public void turnCrank() {
        System.out.println("you just turned, just wait");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0)
            gumballMachine.setState(gumballMachine.getNoQuaterState());
        else
            gumballMachine.setState(gumballMachine.getSoldoutState());
    }
}
