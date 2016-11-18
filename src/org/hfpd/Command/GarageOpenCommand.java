package org.hfpd.Command;

/**
 * Created by yuhzheng on 11/18/16.
 */
public class GarageOpenCommand implements Command {
    Garage garage;

    public GarageOpenCommand(Garage g){
        garage=g;
    }

    public void execute(){
        garage.open();
    }
}
