package org.hfpd.myobserver;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class CurrentConditionsDisplay implements MyObserver, DisplayElement{
    private float temperature;
    private float humidity;
    private float heatIndex;
    private MySubject weatherData;

    public CurrentConditionsDisplay(MySubject wd){
        weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p){
        temperature=t;
        humidity=h;
        heatIndex = (float) 16.234*temperature+2*humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions : "+ temperature +" degrees and "+ humidity + " % humidity with heat index of" + heatIndex);
    }
}
