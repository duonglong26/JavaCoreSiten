package com.nduonglong02.unit04.program;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.lang.System.exit;

public class ShowExampleActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        AwtExample1 screen = new AwtExample1();
        screen.setSize(250, 400);
        screen.setVisible(true);

        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit(1);
            }
        });
    }
}
