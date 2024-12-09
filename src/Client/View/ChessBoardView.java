package Client.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessBoardView {
    JFrame frame;
    JPanel gamePanel;
    MouseListener mouseListener;

    public ChessBoardView() {
        frame = new JFrame("Chess Game");
        frame.setBounds(100, 100, 600, 600);

        gamePanel = new JPanel();
        gamePanel.setSize(600, 600);
        gamePanel.setLayout(new GridLayout(8, 8, 5, 5));
        frame.add(gamePanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setMouseListener(MouseListener mouseListener) {
        this.mouseListener = mouseListener;
    }

    public void toggleChessBoxes() {
        if (!(mouseListener == null)) addChessBoxes();
    }

    public void toggleScreen() {
        frame.setVisible(!frame.isVisible());
    }

    public void addChessBoxes() {
        boolean isGreen = true;
        for (int i = 1; i <= 64; i++) {
            JPanel panel = new JPanel();
            if (isGreen) {
                panel.setBackground(Color.green);
            }
            isGreen = !isGreen;
            panel.addMouseListener(mouseListener);
            gamePanel.add(panel);
            if (i % 8 == 0) isGreen = !isGreen;
        }
    }


}
