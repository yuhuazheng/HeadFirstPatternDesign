package org.hfpd.Proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by yuhzheng on 11/27/16.
 */
public class ImageProxy implements javax.swing.Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url){
        imageURL = url;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon!=null)
            return imageIcon.getIconWidth();
        else
            return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon!=null)
            return imageIcon.getIconHeight();
        else
            return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon!=null)
            imageIcon.paintIcon(c,g,x,y);
        else{
            g.drawString("Loading CD cover...", x+300, y+190);
            if(!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageURL,"CD cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
