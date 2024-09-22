package UI;

import GameConfiguration.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ContentGrid {
    static Boolean[] filled = new Boolean[]{null, false, false, false, false, false, false, false, false, false};
    static GridLayout GL = new GridLayout(3, 3);
    static JPanel  GridStruct = new JPanel(GL);

    public static JLabel A1;
    public static JLabel A2;
    public static JLabel A3;
    public static JLabel B1;
    public static JLabel B2;
    public static JLabel B3;
    public static JLabel C1;
    public static JLabel C2;
    public static JLabel C3;
    static JLabel label1 = new JLabel();



    static {

        GridStruct.setOpaque(false);
        GL.setHgap(1);
        GL.setVgap(10);
        GridStruct.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        label1.setName("Simple text");


        A1 = new JLabel();
        A2 = new JLabel();
        A3 = new JLabel();
        B1 = new JLabel();
        B2 = new JLabel();
        B3 = new JLabel();
        C1 = new JLabel();
        C2 = new JLabel();
        C3 = new JLabel() ;

        A1.setName("1");
        A2.setName("2");
        A3.setName("3");
        B1.setName("4");
        B2.setName("5");
        B3.setName("6");
        C1.setName("7");
        C2.setName("8");
        C3.setName("9");



        A1.setVerticalAlignment(SwingConstants.CENTER);
        A1.setHorizontalAlignment(SwingConstants.CENTER);
        A2.setVerticalAlignment(SwingConstants.CENTER);
        A2.setHorizontalAlignment(SwingConstants.CENTER);
        A3.setVerticalAlignment(SwingConstants.CENTER);
        A3.setHorizontalAlignment(SwingConstants.CENTER);
        B1.setVerticalAlignment(SwingConstants.CENTER);
        B1.setHorizontalAlignment(SwingConstants.CENTER);
        B2.setVerticalAlignment(SwingConstants.CENTER);
        B2.setHorizontalAlignment(SwingConstants.CENTER);
        B3.setVerticalAlignment(SwingConstants.CENTER);
        B3.setHorizontalAlignment(SwingConstants.CENTER);
        C1.setVerticalAlignment(SwingConstants.CENTER);
        C1.setHorizontalAlignment(SwingConstants.CENTER);
        C2.setVerticalAlignment(SwingConstants.CENTER);
        C2.setHorizontalAlignment(SwingConstants.CENTER);
        C3.setVerticalAlignment(SwingConstants.CENTER);
        C3.setHorizontalAlignment(SwingConstants.CENTER);

        B2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5, true));

        GridStruct.add(A1);
        GridStruct.add(A2);
        GridStruct.add(A3);
        GridStruct.add(B1);
        GridStruct.add(B2);
        GridStruct.add(B3);
        GridStruct.add(C1);
        GridStruct.add(C2);
        GridStruct.add(C3);
//        A1.addMouseListener(Config);

//        Listener();

    }
    public static void addListener(MouseListener ml) {
        A1.addMouseListener(ml);
        A2.addMouseListener(ml);
        A3.addMouseListener(ml);
        B1.addMouseListener(ml);
        B2.addMouseListener(ml);
        B3.addMouseListener(ml);
        C1.addMouseListener(ml);
        C2.addMouseListener(ml);
        C3.addMouseListener(ml);
        label1.addMouseListener(ml);



    }


    static JPanel DefaultGrid(){
        return GridStruct;
    }
    public ContentGrid()
    {


    }

    public static void makeEmpty(){
        A1.setIcon(null);
        A2.setIcon(null);
        A3.setIcon(null);
        B1.setIcon(null);
        B2.setIcon(null);
        B3.setIcon(null);
        C1.setIcon(null);
        C2.setIcon(null);
        C3.setIcon(null);
        for (int i = 1; i < filled.length; i++) {
            filled[i] = false;
        }

    }

   public static void putIcon(int position, boolean bool) {
        ImageIcon Thor = Compose.getImageIcon(Compose.bufferedThor, 50);
        ImageIcon Loki = Compose.getImageIcon(Compose.bufferedLoki, 50);

        switch (position){

            case 1:if (!filled[position]){
                if(bool){A1.setIcon(Thor);}else{A1.setIcon(Loki);}
                filled[position] = true;}

            case 2:if (!filled[position]){
                if(bool){A2.setIcon(Thor);}else{A2.setIcon(Loki);}
                filled[position] = true;}

            case 3:if (!filled[position]){
                if(bool){A3.setIcon(Thor);}else{A3.setIcon(Loki);}
                filled[position] = true;}

            case 4:if (!filled[position]){
                if(bool){B1.setIcon(Thor);}else{B1.setIcon(Loki);}
                filled[position] = true;}

            case 5:if (!filled[position]){
                if(bool){B2.setIcon(Thor);}else{B2.setIcon(Loki);}
                filled[position] = true;}

            case 6:if (!filled[position]){
                if(bool){B3.setIcon(Thor);}else{B3.setIcon(Loki);}
                filled[position] = true;}

            case 7:if (!filled[position]){
                if(bool){C1.setIcon(Thor);}else{C1.setIcon(Loki);}
                filled[position] = true;}

            case 8:if (!filled[position]){
                if(bool){C2.setIcon(Thor);}else{C2.setIcon(Loki);}
                filled[position] = true;}

            case 9:if (!filled[position]){
                if(bool){C3.setIcon(Thor);}else{C3.setIcon(Loki);}
                filled[position] = true;}
        }

    }



    }


