package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class GumballMachine {

    State state;
    int count=0;

    State soldoutState;
    State noQuaterState;
    State hasQuaterState;
    State soldState;

    public GumballMachine(int i){
        soldoutState = new SoldoutState(this);
        soldState = new SoldState(this);
        hasQuaterState = new HasQuaterState(this);
        noQuaterState = new NoQuaterState(this);
        count=i;
        if(count>0)
            state = noQuaterState;
        else
            state = soldoutState;
    }

    public State getSoldoutState() {
        return soldoutState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setState(State s){
        state = s;
    }

    public int getCount() {
        return count;
    }

    public void releaseBall(){
        System.out.println("Here you go");
        if(count>0)
            count--;
    }

    public void insertQuater(){
        state.insertQuater();
    }

    public void ejectQuater(){
        state.ejectQuater();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
}
