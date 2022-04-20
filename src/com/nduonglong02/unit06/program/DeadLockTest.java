package com.nduonglong02.unit06.program;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DeadLockTest {
    public static void main(String[] args) {
        ReadWriteLock obj1 = new ReentrantReadWriteLock();
        ReadWriteLock obj2 = new ReentrantReadWriteLock();

        DeadLockDemo thread1 = new DeadLockDemo(obj1, obj2);
        DeadLockDemo thread2 = new DeadLockDemo(obj2, obj1);

        thread1.run();
        thread2.run();
    }
}
