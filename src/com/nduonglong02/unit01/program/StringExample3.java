package com.nduonglong02.unit01.program;

public class StringExample3 {
    public static void main(String[] args) {
        String text = "Absolute Value";
        byte [] bytes = text.getBytes();
        System.out.println("Byte value are");

        for (int i = 0; i < bytes.length; i++) {
            System.out.println((int) bytes[i] + ", ");
        }
    }
}
