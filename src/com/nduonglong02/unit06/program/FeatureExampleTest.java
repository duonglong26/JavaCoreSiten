package com.nduonglong02.unit06.program;

import java.util.concurrent.*;

public class FeatureExampleTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableSample callableSample = new CallableSample();

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(callableSample);

        System.out.println("Future Done ? " + future.isDone());

        Integer result = null;
        try {
            //        Integer result = future.get();
            result = future.get(3, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println("Future Done ? " + future.isDone() + " - result = " + result);

    }
}
