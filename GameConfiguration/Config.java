package GameConfiguration;


import GameConfiguration.Modal.TTCM;
import UI.ContentGrid;
import UI.GameUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Delayed;

import static java.lang.Integer.getInteger;

public class Config implements MouseListener {
    GameUI UI;
    TTCM modal;
    public Config(GameUI UI, TTCM modal){
        this.UI = UI;
        this.modal = modal;

    }
    public void createView(){
        UI.showView();


    }

    @Override
    public void mouseClicked(MouseEvent a) {

//       JLabel label = (JLabel) e.getComponent();

//        modal.takePosition(Integer.getInteger(label.getName()));
        JLabel label = (JLabel) a.getSource();
//        label.setName("No name");
//        int i = (int) label.getName();
//        String GridPosition = label.getName();
        Integer i = Integer.valueOf(label.getName());
        if(modal.takePosition(i)){
        ContentGrid.putIcon(i, modal.getTurn());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ContentGrid.makeEmpty();
        }else {
            ContentGrid.putIcon(i, modal.getTurn());
        }
        if(modal.isAllBoxFilled()){
            ContentGrid.makeEmpty();
            modal.newGame();
        }





//        ContentGrid.putIcon(Integer.getInteger(label.getName()), TTCM.turn);


    }

    @Override
    public void mousePressed(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setOpaque(true);
        label.setBackground(Color.orange);


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setOpaque(false);
        label.setBackground(null);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
/*

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Add elements into gameData
        1. get event id take data

         */
//        JLabel label = (JLabel) e.getSource();

        // label.setIcon();
        // model.setvalue(Click.getText());}



}
