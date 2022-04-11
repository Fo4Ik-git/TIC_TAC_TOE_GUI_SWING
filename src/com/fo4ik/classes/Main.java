package com.fo4ik.classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main extends JFrame {
    public static String[][] arr = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    private JButton settingsButton;
    private JButton playButton;
    private JPanel mainPanel;
    private JPanel logoPanel;
    private JPanel buttonsPanel;

    public Main() {
        initialize();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setSize(640, 360);

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCallGamePerformed(e);
            }
        });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCallSettingsPerformed(e);
            }
        });

    }

    private void ButtonCallGamePerformed(ActionEvent e) {//GEN-FIRST:event_jButtonExitActionPerformed
        new Game().setVisible(true);
        this.dispose();
    }
    private void ButtonCallSettingsPerformed(ActionEvent e) {//GEN-FIRST:event_jButtonExitActionPerformed
        new Settings().setVisible(true);
        this.dispose();
    }
}
