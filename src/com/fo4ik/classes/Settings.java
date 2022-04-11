package com.fo4ik.classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame{
    private JPanel settingsPanel;
    private JButton backButton;
    private JLabel version;

    public Settings(){
        initialize();
    }

    public void initialize(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setContentPane(settingsPanel);
        pack();
        setLocationRelativeTo(null);
        setSize(640, 360);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCallMainPerformed(e);
            }
        });

        version.setText(Config.VERSION);
    }

    private void ButtonCallMainPerformed(ActionEvent e) {//GEN-FIRST:event_jButtonExitActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }
}
