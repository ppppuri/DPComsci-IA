package comsciIA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Newsupdatepage {

    private JFrame frame;
    private JPanel mainPanel;

    public Newsupdatepage() {
        frame = new JFrame("News Updates");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                String[] newsCategories = {
                        "War", "Government", "Politics", "Education", "Health", "Environment", 
                        "Economy", "Business", "Fashion", "Entertainment", "Sport", "Unusual Events"
                };

                int x = 50, y = 50;
                int width = 150, height = 100;
                int cols = 3; // Adjust as necessary

                for (int i = 0; i < newsCategories.length; i++) {
                    g.setColor(Color.BLACK);
                    g.fillOval(x + (i % cols) * (width + 20), y + (i / cols) * (height + 20), width, height);
                    g.setColor(Color.WHITE);
                    g.drawString(newsCategories[i], x + (i % cols) * (width + 20) + 20, y + (i / cols) * (height + 20) + 50);
                }
            }
        };

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Newsupdatepage();
            }
        });
    }

}
