package com.nduonglong02.unit01.program;

public class StringExample2 {
    public static void main(String[] args) {
        args = new String[] {"Duong Long", "Ket"};
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String text = new String(chars);
        System.out.println(text);

        text = text.concat(" ");
        text = text.concat(args[0]); // add string to last index
        System.out.println("New value is " + text);

        System.out.println("hello java".equals(text)); // compare two string
    }
}
