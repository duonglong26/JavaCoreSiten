package com.nduonglong02.unit07.program;

import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) {
        File file = new File("D:" + File.separator + "JavaCoreSitenIo" + File.separator + "siten.txt");
        FileOutputStream outputStream = null;
        FileInputStream inputStream = null;
        byte[] bytes = new byte[100];

        try {
//            read from file
            inputStream = new FileInputStream("D:/JavaCoreSitenIo/siten.txt");
            bytes = new byte[4*1024];

            int read = -1;
            StringBuilder builder = new StringBuilder();
            while ((read = inputStream.read(bytes)) != -1) {
                builder.append(new String(bytes, 0, read));
            }

            inputStream.read(bytes);
            System.out.println(new String(bytes));

//            write to file
//            outputStream =  new FileOutputStream("D:/JavaCoreSitenIo/siten.txt");
//            bytes = "Hello2 Ha Noi Java Class".getBytes();
//            outputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
