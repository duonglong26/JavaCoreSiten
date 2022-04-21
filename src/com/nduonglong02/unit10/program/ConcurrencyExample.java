package com.nduonglong02.unit10.program;

import java.util.ArrayList;
import java.util.List;

public class ConcurrencyExample {
    private static void addData(List list) throws InterruptedException {
        while (true) {
            int random = (int)(Math.random()*100);
            list.add(random);
            System.out.println("Add new data " + random);
            Thread.sleep(100l);
        }
    }

    private static void printData(List list) {
        while (true) {
            try {
                System.out.println("===========");
                list.forEach(value ->
                    System.out.println("Value = " + value)
                );
                try {
                    Thread.sleep(80l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e ) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        /* Start add data */
        new Thread(() -> {
            try {
                addData(list);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        /* Start print data */
        new Thread(() -> {
            printData(list);
        }).start();

    }
}
