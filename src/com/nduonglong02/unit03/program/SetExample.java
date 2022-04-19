package com.nduonglong02.unit03.program;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(1);
        numbers.add(14);
        numbers.add(8);
        numbers.add(8);
        numbers.add(8);
        numbers.add(8);

        System.out.println("Size of set: " + numbers.size());
    }
}
