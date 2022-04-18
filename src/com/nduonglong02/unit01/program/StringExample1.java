package com.nduonglong02.unit01.program;

public class StringExample1 {
    public static void main(String[] args) {
        String text = "say hello to everyone";
        System.out.println("Length of text is " + text.length());

        System.out.println("Vi tri cua tu hello la " + text.indexOf("hello"));

        System.out.println("Cat tu = " + text.substring(4, 8)); // Cut from index "a" to index "b"

        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            }
            System.out.println("Character at " + i + " is " + c);
            i++;
        }
    }
}
