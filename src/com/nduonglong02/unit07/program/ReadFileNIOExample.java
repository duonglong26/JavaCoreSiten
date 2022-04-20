package com.nduonglong02.unit07.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFileNIOExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/JavaCoreSitenIo/siten.txt");
        FileInputStream fileInput = null;
        FileChannel fileChannel = null;

        try {
            fileInput = new FileInputStream(file);
            fileChannel = fileInput.getChannel();

            long size = fileChannel.size();
            ByteBuffer buff = ByteBuffer.allocate((int) size);

            fileChannel.read(buff);
            buff.rewind();

            System.out.println(new String(buff.array(), "utf8"));
        } finally {
            if (fileChannel != null)
                fileChannel.close();
            if (fileInput != null)
                fileInput.close();
        }
    }
}
