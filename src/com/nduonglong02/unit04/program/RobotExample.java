package com.nduonglong02.unit04.program;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;

import static java.lang.System.exit;

public class RobotExample {
    static void leftClick(Robot robot) {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    static void type(Robot robot, String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            if (code > 96 && code < 123) code = code - 32;
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }

    public static void main(String[] args) throws AWTException, IOException {
        Robot robot = new Robot();
        robot.delay(2*1000);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        robot.mouseMove((int) dim.getWidth()/2, (int)dim.getHeight()/2);
        leftClick(robot);

        String userDir = System.getProperty("user.home");
        File file = new File(new File(userDir), "temp.txt");
        if (!file.exists()) file.createNewFile();
        Desktop.getDesktop().edit(file);

        robot.delay(1000);
        type(robot, "Hello, world");

        robot.delay(5*1000);
        exit(0);
    }
}
