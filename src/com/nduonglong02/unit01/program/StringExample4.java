package com.nduonglong02.unit01.program;

public class StringExample4 {
    public static void main(String[] args) {
        // bytes to string
        byte[] bytes = {
                99, -58, -80, -31, -69, -101, 112, 44, 32, 104, 105, -31,
                -70, -65, 112, 44, 32, 103, 105, -31, -70, -65, 116
        };
        try {
            System.out.println(new String(bytes, "utf8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
