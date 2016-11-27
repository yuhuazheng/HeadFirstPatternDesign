package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class HasQuaterState implements State{
    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine m){
        gumballMachine = m;
    }

    public void insertQuater(){
        System.out.println("you can't insert another quater");
    }

    public void ejectQuater(){
        System.out.println("eject a quater");
        gumballMachine.setState(gumballMachine.getNoQuaterState());
    }

    public void turnCrank(){
        System.out.println("you turned");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense(){
        System.out.println("no gumball dispensed");
    }
}
