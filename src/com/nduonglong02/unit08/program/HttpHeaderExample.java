package com.nduonglong02.unit08.program;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class HttpHeaderExample {
    public static void main(String[] args) throws Exception {
        String link = "http://cooc.vn/";
        URL url = new URL(link);

        URLConnection connection = (HttpURLConnection)url.openConnection();

        Map<String, List<String>> headers = connection.getHeaderFields();
        BiConsumer<String,List<String>> header = (key, values) -> {
            System.out.println(
                    "Key: " + key + " Values: " + values
            );
        };
        headers.forEach(header);

    }
}
