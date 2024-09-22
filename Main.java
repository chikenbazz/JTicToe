//import UI.GameUi;

//import AI.Modal;
import GameConfiguration.Config;
import GameConfiguration.Modal.Modal;


import UI.ContentGrid;
import UI.GameUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        GameUI UI = new GameUI();
        SwingUtilities.invokeLater(() ->  {GameUI UI = new GameUI();
        Config gConfig = new Config(UI, Modal.CurrentModal);
        ContentGrid.addListener(gConfig);
        gConfig.createView();



        System.out.println("Hello world!");});}


}