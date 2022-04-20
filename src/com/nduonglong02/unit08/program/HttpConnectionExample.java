package com.nduonglong02.unit08.program;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;

class HttpConnectionExample {
    public static void main(String[] args) {
        String str = "http://cooc.vn/";
        Path path = Paths.get("test.html");
        try {
            URL url = new URL(str);
            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
            OutputStream output = Files.newOutputStream(path, StandardOpenOption.CREATE, APPEND);
            int read;
            byte[] bytes = new byte[1024];
            while((read = input.read(bytes)) != -1){
                output.write(bytes, 0 , read);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                Desktop.getDesktop().open(path.toFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
