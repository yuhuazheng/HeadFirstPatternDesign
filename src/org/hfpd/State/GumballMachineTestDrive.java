package org.hfpd.State;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine m = new GumballMachine(5);
        m.insertQuater();
        m.turnCrank();
    }
}
