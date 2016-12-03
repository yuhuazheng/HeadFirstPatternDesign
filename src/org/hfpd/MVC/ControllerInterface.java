package org.hfpd.MVC;

/**
 * Created by yuhzheng on 12/3/16.
 */
public interface ControllerInterface {
    void start();
    void stop();
    void incBPM();
    void decBPM();
    void setBPM(int bpm);
}
