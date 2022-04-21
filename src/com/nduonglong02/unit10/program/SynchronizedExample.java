package com.nduonglong02.unit10.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SynchronizedExample {
    static void addData(List<Integer> list) {
        IntStream.range(0, 1000).forEach(index -> {
            try {
                list.add(index);
            } catch (Exception exp) {
                System.err.println(exp.toString());
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<List<Integer>> values = new ArrayList<List<Integer>>();
        for (int i = 0; i < 10; i++) {
            List list = new ArrayList<>();
            new Thread(() -> {
                addData(list);
            });
            new Thread(() -> {
                addData(list);
            });

            values.add(list);
        }

        Thread.sleep(5*1000);
        values.forEach(list -> {
            System.out.println("Number items of list ---> " + list.size());
        });
    }
}
