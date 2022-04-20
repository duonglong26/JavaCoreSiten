package com.nduonglong02.unit06.program;

import static java.util.Arrays.stream;

public class PrintMessage implements Runnable {

    private String message;

    public PrintMessage(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {

        String[] elements = message.split(" ");
        stream(elements).forEach(ele -> {
            try {
                System.out.println(Thread.currentThread().getName() + " print " + ele);
                Thread.sleep((int) (Math.random() * 3) * 1000);
//                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
