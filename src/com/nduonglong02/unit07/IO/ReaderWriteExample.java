package com.nduonglong02.unit07.IO;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriteExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/JavaCoreSitenIo/siten.txt");
        try (FileWriter writer = new FileWriter(file, true)){
            writer.write("\r\n");
            writer.write("Tran Thi B");

            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        }

        FileReader reader = null;

        reader = new FileReader(file);
        char[] buffer = new char[4 * 1024];
        StringBuilder builder = new StringBuilder();
        int read;
        while ((read = reader.read(buffer)) != -1) {
            builder.append(buffer, 0, read);
        }
        System.out.println(builder);

        //close reader in the finally block
    }
}
