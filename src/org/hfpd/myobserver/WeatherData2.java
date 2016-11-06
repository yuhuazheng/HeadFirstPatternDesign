package org.hfpd.myobserver;

import java.util.Observable;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2(){

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setMeasurements(float t, float h, float p){
        temperature=t;
        humidity=h;
        pressure=p;
        measurementsChanged();

    }
}
