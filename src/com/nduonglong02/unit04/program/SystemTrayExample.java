package com.nduonglong02.unit04.program;

import javax.swing.*;
import java.awt.*;

public class SystemTrayExample {
    public static void main(String[] args) throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();

        Icon icon = UIManager.getIcon("OptionPane.informationIcon");
        Image image = ((ImageIcon) icon).getImage();

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo", null);
        trayIcon.addActionListener(new ShowExampleActionListener());
        tray.add(trayIcon);

    }
}
