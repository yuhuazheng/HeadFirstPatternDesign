package org.hfpd.Command;

/**
 * Created by yuhzheng on 11/18/16.
 */
public class ControlTest {
    public static void main(String[] args) {
        SimpleControl remote = new SimpleControl();
        MyLight light = new MyLight();
        LightOnCommand lightOn = new LightOnCommand(light);
        Garage garage = new Garage();
        GarageOpenCommand garageOpen = new GarageOpenCommand(garage);

        remote.setCommand(lightOn);
        remote.buttonPressed();
        remote.setCommand(garageOpen);
        remote.buttonPressed();
    }
}
