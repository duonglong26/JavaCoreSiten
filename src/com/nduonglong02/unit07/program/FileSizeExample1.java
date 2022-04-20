package com.nduonglong02.unit07.program;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class FileSizeExample1 {
    private static long getSize(File file) {
        if (file.isFile())
            return file.length();
//        File[] files = file.listFiles();
//        int length = 0;
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isDirectory()) {
//                length += getSize(files[i]);
//                continue;
//            }
//            length += files[i].length();
//        }
//        return length;

        AtomicLong length = new AtomicLong(0);
        Arrays.stream(file.listFiles()).forEach(f -> {
            length.getAndSet(length.longValue()
                    + (f.isDirectory() ? getSize(f) : f.length()));
        });
        return length.longValue();
    }

    public static void main(String[] args) {
        File file = new File("D:\\JavaCoreSitenIo");
        System.out.println("Size: " + getSize(file) / (1024 * 1024) + "MB");
    }
}
