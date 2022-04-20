package com.nduonglong02.unit06.program;

public class ThreadNumberTest {
    public static void main(String[] args) throws InterruptedException {
//        PrintNumber number = new PrintNumber();
//
//        Thread thread = new Thread(number);
//        thread.setName("FSoft_Thread");
//        thread.setDaemon(true);
//        thread.start();

//        Thread.currentThread().join();
//        System.out.println("Main Thread say hello");
//        System.out.println("Main Thread say goodbye");

//        while (thread.isAlive()) {
//            try {
//                if (number.getNumber() % 3 == 0) number.setAlive(false);
//                TimeUnit.SECONDS.sleep(1);
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        PrintNumber number = new PrintNumber();

        Thread thread1 = new Thread(number);
        thread1.setName("FSoft_Thread 1");
        thread1.start();

        Thread thread2 = new Thread(number);
        thread2.setName("FSoft_Thread 2");
        thread2.start();
    }
}
