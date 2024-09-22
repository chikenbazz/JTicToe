package UI;

import GameConfiguration.Modal.TTCM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LWStatusBar extends JPanel {
    JLabel played;
    JPanel panel;
    Graphics d;

    public LWStatusBar(){
        played = new JLabel();
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        setLayout(new FlowLayout());
        add(played);
        setPlayed();
    }
    public void setPlayed(){
        played.setText(TTCM.getNoOfWins());

        played.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                d = getGraphics();
//                played.setText(null);

//                d.drawLine(0,0, 200, 0);
                d.fillRoundRect(0,0, 200, 3, 60, 60);

                d.create();
//                d.dispose();

            }
        });
    }

}
