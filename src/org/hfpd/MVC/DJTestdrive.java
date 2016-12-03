package org.hfpd.MVC;

/**
 * Created by yuhzheng on 12/3/16.
 */
public class DJTestdrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
