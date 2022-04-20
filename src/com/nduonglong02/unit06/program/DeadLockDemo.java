package com.nduonglong02.unit06.program;

import java.util.concurrent.locks.ReadWriteLock;

public class DeadLockDemo extends Thread {
    private ReadWriteLock lock1, lock2;

    public DeadLockDemo(ReadWriteLock lock1, ReadWriteLock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + ": Holding " + lock1 + "...");
            try {
                Thread.sleep(10);

                System.out.println(Thread.currentThread().getName() + ": waiting for " + lock2 + "...");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "--------->" + lock1 + " : " + lock2 + "...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
