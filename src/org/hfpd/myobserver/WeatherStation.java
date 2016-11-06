package org.hfpd.myobserver;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(80,65,30.4f);
        wd.setMeasurements(82,70,29.2f);
        wd.setMeasurements(78,90,29.2f);

        WeatherData2 wd2 = new WeatherData2();
        CurrentConditionsDisplay2 ccd2 = new CurrentConditionsDisplay2(wd2);

        wd2.setMeasurements(80,65,30.4f);
        wd2.setMeasurements(82,70,29.2f);
        wd2.setMeasurements(78,90,29.2f);
    }
}
