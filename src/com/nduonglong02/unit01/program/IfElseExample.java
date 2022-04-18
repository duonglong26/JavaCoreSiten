package com.nduonglong02.unit01.program;

public class IfElseExample {
    public static void main(String[] args) {
        args = new String[] {"26"};
        int value = Integer.parseInt(args[0]);
        if (value < 5) {
            System.out.println("bad");
        } else {
            System.out.println("ok");
        }
    }
}
