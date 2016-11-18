package org.hfpd.Command;

/**
 * Created by yuhzheng on 11/18/16.
 */
public class SimpleControl {
    Command slot;

    public SimpleControl(){}

    public void setCommand(Command c){
        slot=c;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
