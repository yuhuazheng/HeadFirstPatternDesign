package org.hfpd.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yuhzheng on 11/27/16.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
