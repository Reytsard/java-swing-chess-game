package Client.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessBoardView {
    JFrame frame;
    JPanel gamePanel;

    public ChessBoardView() {
        frame = new JFrame("Chess Game");
        frame.setBounds(100, 100, 600, 600);

        gamePanel = new JPanel();
        gamePanel.setSize(600, 600);
        gamePanel.setLayout(new GridLayout(8, 8, 5, 5));

        frame.add(gamePanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addChessBoxes(){
        for(int i = 0; i < 64; i++){
            JPanel panel = new JPanel();
            panel.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }
    }




}
