package com.nduonglong02.unit02.program;

import java.util.Arrays;
import java.util.Comparator;

import static com.nduonglong02.unit02.utils.ArrayUtils.showArray;

public class SortArrayExample {
    public static void main(String[] args) {
        args = new String[]{"a", "d", "c"};

        Arrays.sort(args);

        showArray(args);

        System.out.println("=================");

        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        showArray(args);
    }


}
