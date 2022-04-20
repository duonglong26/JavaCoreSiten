package com.nduonglong02.unit06.program;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class SimpleThreadSample {
    public static void main(String[] args) {
        args = new String[] {"he", "lo"};
        String[] finalArgs = args;
        new Thread(
                () -> {
//                    stream(finalArgs).forEach(ele -> System.out.println(ele));
                    stream(finalArgs).forEach(ele -> {
                        try {
                            Thread.sleep(1000);
                            System.out.println(ele);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                }
        ).start();
    }
}
