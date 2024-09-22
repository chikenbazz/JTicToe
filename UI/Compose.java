package UI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Compose extends JPanel {
    JLabel backgroundIMG;
    static int Height, Width;
    static  JLayeredPane layeredPane;
    static BufferedImage bufferedBackGround;
    static BufferedImage bufferedFieldLining;
    static BufferedImage bufferedThor;
    static BufferedImage bufferedLoki;


    static {
        try {
            bufferedBackGround = ImageIO.read(new File("src/assets/art/background.png"));
            bufferedFieldLining = ImageIO.read(new File("src/assets/art/board.png"));
            bufferedLoki = ImageIO.read(new File("src/assets/art/cross.png"));
            bufferedThor = ImageIO.read(new File("src/assets/art/naught.png"));
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
    static ImageIcon getImageIcon(BufferedImage bufferedImage, int width){
        Image src = bufferedImage.getScaledInstance(width,-1, Image.SCALE_FAST);
        return new ImageIcon(src);
    }
    public Compose (/*JLayeredPane layeredPane*/){
//        new JPanel();

//        setBackground(Color.pink);

        OverlayLayout ov = new OverlayLayout(this);
        setLayout(ov);
        JPanel ComposeGrid = ContentGrid.DefaultGrid();


        backgroundIMG = new JLabel();


        backgroundIMG.setPreferredSize(new Dimension(Math.min(Height, Width), Math.min(Height, Width)));
        add(backgroundIMG);
        backgroundIMG.setIcon(Compose.getImageIcon(Compose.bufferedFieldLining, 559));
        backgroundIMG.setBounds(0,0, Width, Height);
        backgroundIMG.setOpaque(false);
        backgroundIMG.setBorder(BorderFactory.createLineBorder(Color.red));
        addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                super.componentAdded(e);
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                super.componentMoved(e);
            }
        });


        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                backgroundIMG.setIcon(Compose.getImageIcon(Compose.bufferedFieldLining, Math.min(getWidth(), getHeight())));
                Height = backgroundIMG.getHeight();
                Width = backgroundIMG.getWidth();
                backgroundIMG.setPreferredSize(new Dimension(Math.min(Height, Width), Math.min(Height, Width)));
                backgroundIMG.setBounds(0,0, Width, Height);

                ComposeGrid.setBounds(backgroundIMG.getBounds());
                ComposeGrid.setMaximumSize(backgroundIMG.getMaximumSize());
                ComposeGrid.setMinimumSize(backgroundIMG.getMinimumSize());
                ComposeGrid.setSize(backgroundIMG.getSize());
                ComposeGrid.setPreferredSize(backgroundIMG.getPreferredSize());
                ComposeGrid.setAlignmentY(backgroundIMG.getAlignmentY());
                ComposeGrid.setAlignmentX(backgroundIMG.getAlignmentX());
//                SwingUtilities.updateComponentTreeUI(MAC);



            }
        });

        ComposeGrid.setBounds(backgroundIMG.getBounds());
        ComposeGrid.setMaximumSize(backgroundIMG.getSize());
        ComposeGrid.setMinimumSize(backgroundIMG.getSize());
//        JLabel l = new JLabel();
//        l.setText("SImpole text");

//        add(l);

        add(ComposeGrid);



    }







}
