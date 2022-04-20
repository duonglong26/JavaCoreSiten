package com.nduonglong02.unit07.IO;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("D:\\JavaCoreSitenIo");

        System.out.println("This is " + (file.isFile() ? "file" : "folder") + "!");

        File[] files = file.listFiles();

        for (File f : files) {
            System.out.println(f.getName() + " : " + f.length() + " bytes");
        }
    }
}
