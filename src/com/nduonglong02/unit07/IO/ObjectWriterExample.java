package com.nduonglong02.unit07.IO;

import com.nduonglong02.unit06.program.PrintMessage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterExample {
    public static void main(String[] args) throws Exception {
        File folder = new File("D:/JavaCoreSitenIo");
        ObjectOutputStream output = null;

        FileOutputStream fileOutput =
                new FileOutputStream(new File(folder, "my_object"));
        output = new ObjectOutputStream(fileOutput);

        output.writeObject(new PrintMessage("Can Noi Noi"));

        // close output
    }
}
