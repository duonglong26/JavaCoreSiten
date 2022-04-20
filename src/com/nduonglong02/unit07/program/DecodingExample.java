package com.nduonglong02.unit07.program;

import java.io.UnsupportedEncodingException;

public class DecodingExample {
    public static void main(String[] args) {
        int[] values = {120, 105, 110, 32, 99, 104, -61, -96, 11};
        byte[] bytes = new byte[12];

        for (int i = 0; i < values.length; i++) {
            bytes[i] = (byte) values[i];
        }
        try {
            System.out.println(new String(bytes, "utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
