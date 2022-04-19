package com.nduonglong02.unit03.program;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        args = new String[] {"he", "lo"};
        List<String> list = new LinkedList<>(Arrays.asList(args));

        list.forEach(value -> {
            System.out.println(value);
        });

    }
}
