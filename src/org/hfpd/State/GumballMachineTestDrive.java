package org.hfpd.State;

import java.rmi.RemoteException;

/**
 * Created by yuhzheng on 11/26/16.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException{
        GumballMachine m = new GumballMachine(5);
        m.insertQuater();
        m.turnCrank();
    }
}
