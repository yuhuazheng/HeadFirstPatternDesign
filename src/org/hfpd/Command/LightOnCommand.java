package org.hfpd.Command;

/**
 * Created by yuhzheng on 11/18/16.
 */
public class LightOnCommand implements Command {
    MyLight light;

    public LightOnCommand(MyLight l){
        light = l;
    }

    public void execute(){
        light.on();
    }
}
