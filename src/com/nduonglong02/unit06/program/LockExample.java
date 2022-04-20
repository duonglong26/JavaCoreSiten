package com.nduonglong02.unit06.program;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CallableSample sample = new CallableSample();

        List<CallableSample> callables = Arrays.asList(
                new CallableSample(), new CallableSample(), new CallableSample(), new CallableSample()
        );

        try {
            executor.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
