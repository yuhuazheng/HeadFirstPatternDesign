package org.hfpd.MVC;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * Created by yuhzheng on 12/2/16.
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList beatObserver = new ArrayList();
    ArrayList bpmObserver = new ArrayList();
    int bpm=90;

    Sequence sequence;
    Track track;

    @Override
    public void initialize(){
        try {
            setUpMidi();
            buildTrackAandStart();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm =  bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObserver();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObserver.add(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObserver.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObserver.remove(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bpmObserver.remove(o);
    }

     public void notifyBPMObserver(){
         for(int i=0;i<bpmObserver.size();i++){
             BPMObserver o = (BPMObserver) bpmObserver.get(i);
             o.updateBPM();
         }
     }

     public void notifyBeatObservers(){
         for(int i=0;i<beatObserver.size();i++){
             BeatObserver o = (BeatObserver) beatObserver.get(i);
             o.updateBeat();
         }
     }

     public void meta(MetaMessage mesage){
         if(mesage.getType() == 47){
             beatEvent();
             sequencer.start();
             setBPM(getBPM());
         }
     }

     public void setUpMidi() throws MidiUnavailableException, InvalidMidiDataException{
         try {
             sequencer = MidiSystem.getSequencer();
             sequencer.open();
             sequencer.addMetaEventListener(this);
             sequence = new Sequence(Sequence.PPQ, 4);
             track = sequence.createTrack();
             sequencer.setTempoInBPM(getBPM());
         } catch (Exception e){
             e.printStackTrace();
         }
     }

     public void buildTrackAandStart(){
         int[] trackList = {35, 0, 46, 0};
         sequence.deleteTrack(null);
         track = sequence.createTrack();
         makeTracks(trackList);
         track.add(makeEvent(192, 9, 1, 0,4));
         try{
             sequencer.setSequence(sequence);
         } catch (Exception e){
             e.printStackTrace();
         }
     }

     public void makeTracks(int[] lists){
         for(int i=0;i< lists.length;i++){
             int key = lists[i];
             if(key != 0){
                 track.add(makeEvent(144,9,key,100,i));
                 track.add(makeEvent(128,9,key,100,i+1));
             }
         }
     }

     public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
         MidiEvent event = null;
         try{
             ShortMessage a = new ShortMessage();
             a.setMessage(comd, chan, one, two);
             event = new MidiEvent(a, tick);
         } catch (Exception e){
             e.printStackTrace();
         }
         return event;
     }
}
