package com.nduonglong02.unit06.program;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        HashMap<Object, Object> map = new HashMap<>();

        ReadWriteLock lock = new ReentrantReadWriteLock();

        executor.submit(() -> {
            System.out.println("Start writing");
            lock.writeLock().lock();
            System.out.println("----------------");
            try {
                TimeUnit.SECONDS.sleep(5); //10
                map.put("foo", "bar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
                System.out.println("End writing");
            }
        });

        Runnable readTask = () -> {
            System.out.println("Start reading");
            lock.readLock().lock();
            System.out.println("=========");
            try {
                System.out.println(map.get("foo"));
            } finally {
                lock.readLock().unlock();
                System.out.println("End reading");
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

    }
}
