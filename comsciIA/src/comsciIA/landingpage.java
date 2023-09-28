package comsciIA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class landingpage {

    private JFrame frame;
    private JPanel mainPanel;
    private JButton weatherButton;
    private JButton newsButton;

    public landingpage() {
        frame = new JFrame("MorningNews Landing Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.ORANGE);
        JLabel titleLabel = new JLabel("MorningNews");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(titleLabel);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1, 10, 10));

        weatherButton = new JButton("Weather Updates");
        weatherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to open weather updates section here
                JOptionPane.showMessageDialog(frame, "Weather Updates Section");
                
                
            }
        });

        newsButton = new JButton("News Updates");
        newsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to open news updates section here
                JOptionPane.showMessageDialog(frame, "News Updates Section");
                
                new Newsupdatepage();
            }
        });

        centerPanel.add(weatherButton);
        centerPanel.add(newsButton);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }


}
