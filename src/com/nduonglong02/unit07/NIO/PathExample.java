package com.nduonglong02.unit07.NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("D:/JavaCoreSitenIo");
        System.out.println("This is " + (Files.isDirectory(path) ? "file" : "folder") + "!");
        System.out.println(Files.exists(path));


    }
}
