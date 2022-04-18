package com.nduonglong02.unit01.program;

import java.util.Arrays;

public class StreamPrgram {
    public static void main(String[] args) {
        args = new String[]{"say", "goodbye", "to", "you"};

        System.out.println("The number of arguments is " + args.length);

        Arrays.stream(args).forEach((String value) -> {
            System.out.println("Value is " + value);
        });
    }
}
