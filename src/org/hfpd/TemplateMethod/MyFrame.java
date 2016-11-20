package org.hfpd.TemplateMethod;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yuhzheng on 11/19/16.
 */
public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        String msg = "I rule";
        g.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("hfdp hack");
    }
}
