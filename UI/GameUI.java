package UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameUI  {
    static JFrame MAC;
    static JLayeredPane layeredPane;
    static Compose composed;
    static SunPanel megaPanel;
    static  LWToolBar lightWeightPanel;
    static  LWStatusBar lightWeightPanel2;


    public GameUI() {
//        lightWeightPanel = new LWToolBar();
//        lightWeightPanel2 = new LWStatusBar();

    }
 public void showView(){

        JLabel text = new JLabel("simple text");

     lightWeightPanel = new LWToolBar();
     lightWeightPanel2 = new LWStatusBar();
     megaPanel = new SunPanel();
        MAC = new JFrame();
        layeredPane = MAC.getLayeredPane();
        composed = new Compose(/*layeredPane*/);
        MAC.setVisible(true);
        MAC.setSize(559, 559);
        MAC.setMinimumSize(new Dimension(250, 350));
        MAC.setLayout(new BorderLayout());
        MAC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MAC.add(composed, BorderLayout.CENTER);
        MAC.add(text, BorderLayout.NORTH);
        showVertical();



    }
    public void showHorizontal(){

        MAC.remove(lightWeightPanel);
        MAC.remove(lightWeightPanel2);

        MAC.add(megaPanel, BorderLayout.EAST);


    }

    public void showVertical(){
//
        MAC.remove(megaPanel);

        MAC.add(lightWeightPanel, BorderLayout.NORTH);
        MAC.add(lightWeightPanel2, BorderLayout.SOUTH);

    }


    public void setActivity(){}

 }



