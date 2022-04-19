package com.nduonglong02.unit03.program;

import java.util.*;

public class CollectionsExample1 {
    public static void main(String[] args) {
        Short[] values = {1, 2, 4, 5, 6, 7, 8, 9};

        List<Short> list = new LinkedList<>(Arrays.asList(values));
        Collections.addAll(list, values);

        Collections.reverse(list);

        list.toArray(values);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + ", ");
        }

        Short max = list.stream().max(Comparator.
                comparing(Integer::valueOf)).get();

        Short min = list.stream().min(Comparator.
                comparing(Integer::valueOf)).get();

        System.out.println("Max in list: " + max);
        System.out.println("MIn in list: " + min);

    }
}
