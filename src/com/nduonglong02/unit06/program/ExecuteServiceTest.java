package com.nduonglong02.unit06.program;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class ExecuteServiceTest {
    public static void main(String[] args) {
        try {
            PrintNumber number = null;
            Callable<Object> value = Executors.callable(number);
            System.out.println("Main say hello");
            value.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main say goodbye");
    }
}
