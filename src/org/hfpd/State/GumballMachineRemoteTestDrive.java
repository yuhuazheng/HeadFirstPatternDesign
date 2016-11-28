package org.hfpd.State;

import java.rmi.Naming;
import java.rmi.RemoteException;


/**
 * Created by yuhzheng on 11/27/16.
 */
public class GumballMachineRemoteTestDrive {
    public static void main(String[] args) throws RemoteException {
        int count = 10;
        try{
            GumballMachine m = new GumballMachine("Seattle",count);
            Naming.rebind("Seattle", m);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
