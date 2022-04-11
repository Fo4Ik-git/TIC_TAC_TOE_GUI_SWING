package com.fo4ik.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    int moveCount;
    private JPanel gamePanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button7;
    private JButton button5;
    private JButton button8;
    private JButton button6;
    private JButton button9;
    private JLabel POneWin;
    private JLabel PTwoWin;
    private JButton resetButton;
    private JLabel PTwoScore;
    private JLabel POneScore;
    private JButton backButton;
    private int POneScoreInt = 0;
    private int PTwoScoreInt = 0;
    private boolean xGo = true;
    private boolean win = false;
    private String messageErrorDraw = "No body win, the place will be reset";
    private String messageErrorWin = "The player has won, the place will be reset";
    private String[][] arr = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    public Game() {
        initialize();
        configureController();
    }

    public void writeToArray(JButton button, ActionEvent e, String num) {
        try {

            Object source = e.getSource();
            if (button1.equals(source)) {
                if (arr[0][0].equals(" ")) {
                    arr[0][0] = num;
                } else {
                    setText(button, e, win);

                }
            } else if (button2.equals(source)) {
                if (arr[0][1].equals(" ")) {
                    arr[0][1] = num;
                } else {
                    setText(button, e, win);
                }
            } else if (button3.equals(source)) {
                if (arr[0][2].equals(" ")) {
                    arr[0][2] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button4.equals(source)) {
                if (arr[1][0].equals(" ")) {
                    arr[1][0] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button5.equals(source)) {
                if (arr[1][1].equals(" ")) {
                    arr[1][1] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button6.equals(source)) {
                if (arr[1][2].equals(" ")) {
                    arr[1][2] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button7.equals(source)) {
                if (arr[2][0].equals(" ")) {
                    arr[2][0] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button8.equals(source)) {
                if (arr[2][1].equals(" ")) {
                    arr[2][1] = num;
                } else {

                    setText(button, e, win);
                }
            } else if (button9.equals(source)) {
                if (arr[2][2].equals(" ")) {
                    arr[2][2] = num;
                } else {

                    setText(button, e, win);
                }
            }
        } catch (Exception exception) {

        }
    }

    public void resetResult() {
        xGo = true;
        win = false;

        arr[0][0] = " ";
        arr[0][1] = " ";
        arr[0][2] = " ";
        arr[1][0] = " ";
        arr[1][1] = " ";
        arr[1][2] = " ";
        arr[2][0] = " ";
        arr[2][1] = " ";
        arr[2][2] = " ";

        button1.setText(arr[0][0]);
        button2.setText(arr[0][1]);
        button3.setText(arr[0][2]);
        button4.setText(arr[1][0]);
        button7.setText(arr[1][1]);
        button5.setText(arr[1][2]);
        button8.setText(arr[2][0]);
        button6.setText(arr[2][1]);
        button9.setText(arr[2][2]);

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);

        POneWin.setText("");
        PTwoWin.setText("");
    }

    public final void configureController() {
        button1.setText(arr[0][0]);
        button2.setText(arr[0][1]);
        button3.setText(arr[0][2]);
        button4.setText(arr[1][0]);
        button5.setText(arr[1][1]);
        button6.setText(arr[1][2]);
        button7.setText(arr[2][0]);
        button8.setText(arr[2][1]);
        button9.setText(arr[2][2]);

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setContentPane(gamePanel);
        pack();
        setLocationRelativeTo(null);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetResult();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonCallMainPerformed(e);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button1, e, win);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button2, e, win);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button3, e, win);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button4, e, win);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button5, e, win);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button6, e, win);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button7, e, win);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button8, e, win);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(button9, e, win);
            }
        });

    }

    private void ButtonCallMainPerformed(ActionEvent e) {//GEN-FIRST:event_jButtonExitActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }

    public void setText(JButton button, ActionEvent e, boolean win) {
        if (!win) {


            if (xGo) {
                writeToArray(button, e, "X");
                button.setText("X");
                button.setBackground(Color.RED);
                xGo = false;
                checkWin();

            } else {
                writeToArray(button, e, "O");
                button.setText("O");
                button.setBackground(Color.GREEN);
                xGo = true;
                checkWin();
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), messageErrorWin, "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void checkWin() {

        int countX = 0, countO = 0;
        int countXx = 0, countOo = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].equals("X")) countX++;
                if (arr[i][j].equals("O")) countO++;
                if(!arr[i][j].equals(" ")) count++;

                if (arr[j][i].equals("X")) countXx++;
                if (arr[j][i].equals("O")) countOo++;

                if(count==9){
                    messageWin("draw");
                } else

                if (countX == 3 || countXx == 3) {
                    POneWin.setText("Win");
                    POneScoreInt++;
                    POneScore.setText(String.valueOf(POneScoreInt));
                    messageWin("win");
                } else
                if (countO == 3 || countOo == 3) {
                    PTwoWin.setText("Win");
                    PTwoScoreInt++;
                    PTwoScore.setText(String.valueOf(PTwoScoreInt));
                    messageWin("win");
                }


            }
            countO = 0;
            countX = 0;
            countOo = 0;
            countXx = 0;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i][i].equals("X")) countX++;
            if (arr[i][i].equals("O")) countO++;

            if (countX == 3) {
                POneWin.setText("Win");
                POneScoreInt++;
                POneScore.setText(String.valueOf(POneScoreInt));
                messageWin("win");
            }
            if (countO == 3) {
                PTwoWin.setText("Win");
                PTwoScoreInt++;
                PTwoScore.setText(String.valueOf(PTwoScoreInt));
                messageWin("win");
            }
        }
        countO =0;
        countX=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                // Condition for secondary diagonal
                if ((i + j) == (arr.length - 1)) {
                    if (arr[i][j].equals("X")) countX++;
                    if (arr[i][j].equals("O")) countO++;

                    if (countX == 3) {
                        POneWin.setText("Win");
                        POneScoreInt++;
                        POneScore.setText(String.valueOf(POneScoreInt));
                        messageWin("win");
                    }
                    if (countO == 3) {
                        PTwoWin.setText("Win");
                        PTwoScoreInt++;
                        PTwoScore.setText(String.valueOf(PTwoScoreInt));
                        messageWin("win");
                    }
                }
            }
        }



    }

    void messageWin(String what) {

        switch (what) {
            case "win":
                JOptionPane.showMessageDialog(new JFrame(), messageErrorWin, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case "draw":
                JOptionPane.showMessageDialog(new JFrame(), messageErrorDraw, "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }

        resetResult();
    }
}
