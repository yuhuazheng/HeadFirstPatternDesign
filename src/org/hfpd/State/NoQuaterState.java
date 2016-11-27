package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class NoQuaterState implements State {
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine m){
        gumballMachine = m;
    }

    public void insertQuater(){
        System.out.println("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }

    public void ejectQuater(){
        System.out.println("you haven't inserted quater yet");
    }

    public void turnCrank(){
        System.out.println("you haven't inserted quater yet");
    }

    public void dispense(){
        System.out.println("you haven't inserted quater yet");
    }
}
