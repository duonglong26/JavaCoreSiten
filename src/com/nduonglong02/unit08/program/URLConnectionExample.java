package com.nduonglong02.unit08.program;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) throws Exception {
        String link = "http://cooc.vn/";
        URL url = new URL(link);

        URLConnection connection = url.openConnection();

        InputStream stream = connection.getInputStream();

        int read;
        byte[] bytes = new byte[10];
        while ((read = stream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
    }
}
