package com.nduonglong02.unit01.program;

public class Myprgram {
    public static void main(String[] args) {
        args = new String[]{"say", "goodbye", "to", "you"};
        System.out.println("The number of arguments is " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Value at " + i + " is " + args[i]);
        }
    }
}
