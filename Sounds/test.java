package Sounds;
/* import Sounds.TMPAudioSystem;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;*/

import javax.swing.*;
import java.awt.*;

public class test extends JPanel {
    public void showUi(){

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawLine(0, 0, 100, 100);
        g.create();
        repaint();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        test panel = new test();
        panel.paintComponents(f.getGraphics());
        Graphics g = f.getGraphics();
        g.drawLine(0, 0, 50, 50);
        g.create();
        f.add(panel);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }



}
