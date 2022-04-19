package com.nduonglong02.unit03.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListExample {
    public static void main(String[] args) {
        args = new String[] {"he", "lo"};
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, args);

//        Test 1:
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element at " + i + " is " + list.get(i));
//        }

//        Test 2:
        IntStream.range(0, list.size()).forEach(i -> {
            System.out.println("Element at " + i + " is " + list.get(i));
        });
    }
}
