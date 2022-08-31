package com.observer.pattern.swing_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class SwingObserverExample {
    private static final Logger LOGGER = Logger.getLogger(SwingObserverExample.class.getName());

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Should I do it?");

        setActiveListenerWithoutLambdas(button);
        setActiveListenerWithLambdas(button);

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void setActiveListenerWithoutLambdas(JButton button) {
        button.addActionListener(new AngelActionListener());
        button.addActionListener(new DevilActionListener());
    }

    private void setActiveListenerWithLambdas(JButton button) {
        button.addActionListener(event -> LOGGER.info("Be Careful, You might regret it later.."));
        button.addActionListener(event -> LOGGER.info("You Don't have to do that.."));
    }

    static class AngelActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            LOGGER.info("Don't Do It, You might regret it later..");
        }
    }

    static class DevilActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            LOGGER.info("Do It, It will be Fun!!");
        }
    }
}
