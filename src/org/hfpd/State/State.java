package org.hfpd.State;

import java.io.Serializable;

/**
 * Created by yuhzheng on 11/26/16.
 */
public interface State extends Serializable{

    public void insertQuater();
    public void ejectQuater();
    public void turnCrank();
    public void dispense();

}
