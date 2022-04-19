package com.nduonglong02.unit02.utils;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ArrayUtils {
    public static void showArray(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void showArray(Integer[] values) {
//        Test 1:
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//        Stream <Integer> stream = Arrays.stream(values);
//        stream.forEach(value -> System.out.println(value));

//        Test 2:
        Stream <Integer> stream = Arrays.stream(values);
        Consumer<Integer> c = (Integer value) -> {
            System.out.println(value);
        };
        stream.forEach(c);
    }
}
