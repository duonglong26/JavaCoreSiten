package com.nduonglong02.unit04.program;

import java.awt.*;

public class AWTSimple {
    public static void main(String[] args) {
        Frame screen = new Frame();

        screen.setLayout(null);

        Panel panel = new Panel();

        panel.setBounds(30, 60, 500, 70);

        panel.setBackground(Color.YELLOW);

        screen.add(panel);

        screen.setSize(600, 200);
        screen.setVisible(true);
    }
}
