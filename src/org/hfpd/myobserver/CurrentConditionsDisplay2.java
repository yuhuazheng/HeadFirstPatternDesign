package org.hfpd.myobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
    Observable sub;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable o){
        sub=o;
        sub.addObserver(this);
    }

    @Override
    public void update(Observable os, Object arg){
        if( os instanceof WeatherData2){
            WeatherData2 wd = (WeatherData2) os;
            temperature = wd.getTemperature();
            humidity = wd.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions : "+ temperature +" degrees and "+ humidity + " % humidity");
    }
}
