package org.hfpd.myobserver;

import java.util.ArrayList;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class WeatherData implements MySubject {
    private ArrayList<MyObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers= new ArrayList<>();
    }

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        int i = observers.indexOf(o);
        if(i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for(MyObserver o : observers)
            o.update(temperature,humidity, pressure);
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float t, float h, float p){
        temperature=t;
        humidity=h;
        pressure=p;
        measurementsChanged();
    }
}
