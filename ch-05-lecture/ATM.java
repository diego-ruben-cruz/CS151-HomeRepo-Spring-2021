package ch05;

import javax.swing.*;
import java.awt.*;

public class ATM {
    JFrame frame;

    public ATM() {
        JButton withdraw = new JButton("withdraw");
        JButton deposit = new JButton("deposit");
        JTextField amount = new JTextField("$...");

        withdraw.addActionListener(event -> {/* some actions */});
        deposit.addActionListener(event -> {/* some actions */});

        frame = new JFrame();
        frame.add(withdraw);
        frame.add(deposit);
        frame.add(amount);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

