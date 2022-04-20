package com.nduonglong02.unit07.IO;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class CopyFileNIOExample {
    public static void main(String[] args) throws Exception {
        File sourceFile = new File("D:/JavaCoreSitenIo/siten.txt");
        File desFile = new File(sourceFile.getParentFile() + "/sample2.txt");
        FileChannel srcChanel = null;
        FileChannel desChanel = null;

        srcChanel = new FileInputStream(sourceFile).getChannel();
        desChanel = new FileOutputStream(desFile).getChannel();
        srcChanel.transferTo(0, srcChanel.size(), desChanel);

        Desktop.getDesktop().open(sourceFile.getParentFile());
    }
}
