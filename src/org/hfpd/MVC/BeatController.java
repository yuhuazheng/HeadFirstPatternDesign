package org.hfpd.MVC;

/**
 * Created by yuhzheng on 12/3/16.
 */
public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model){
        this.model =  model;
        view = new DJView(this,model);
        view.createView();
        view.createControl();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void incBPM() {
        model.setBPM(model.getBPM()+1);
    }

    @Override
    public void decBPM() {
        model.setBPM(model.getBPM()-1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
