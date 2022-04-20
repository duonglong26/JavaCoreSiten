package com.nduonglong02.unit06.program;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class InvokeAllExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<CallableSample> callables = Arrays.asList(
                new CallableSample(), new CallableSample(), new CallableSample()
        );

        try {
            Stream<Future<Integer>> stream = executor.invokeAll(callables).stream();
            Stream<Integer> resultStream = stream.map(future -> {
                try {
                    return future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                return null;
            });


            Integer[] results = resultStream.toArray(Integer[]::new);
            stream(results).forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
