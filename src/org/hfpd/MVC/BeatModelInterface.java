package org.hfpd.MVC;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Created by yuhzheng on 12/2/16.
 */
public interface BeatModelInterface {
    //model itself
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    //observer for view and controller
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
