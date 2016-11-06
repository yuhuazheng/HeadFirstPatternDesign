package org.hfpd.myobserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yuhzheng on 11/5/16.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample inst = new SwingObserverExample();
        inst.go();
    }

    public void go(){
        frame = new JFrame();
        JButton bt = new JButton("should I do it?");
        bt.addActionListener(new AngelListener());
        bt.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,bt);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            System.out.println("don't do it, regret.");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            System.out.println("just do it!");
        }
    }
}
