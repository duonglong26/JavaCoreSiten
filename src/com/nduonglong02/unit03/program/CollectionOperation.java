package com.nduonglong02.unit03.program;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> listInitial = Arrays.asList(4, 7, 1, 3, 8, 9, 2, 6, 10);
        List<Integer> listOfIntegers = new ArrayList<>(listInitial);
        Comparator<Integer> comparator = Integer::compare;
        Collections.sort(listOfIntegers, comparator);

        listOfIntegers.forEach(index -> {
            System.out.print(index + ", ");
        });

        System.out.println("\nFilter 1 :");
        listOfIntegers.stream().filter(value -> value > 5).forEach(value -> {
            System.out.print(value + ", ");
        });

        Integer[] values = listOfIntegers.stream().filter(value -> value > 5)
                .toArray(size -> new Integer[size]);

        System.out.println("\nFilter 2 :");
        Arrays.stream(values).forEach(value -> {
            System.out.print(value + ", ");
        });

        System.out.println("\nExample 2 page 14/21: ");
        Collector<Integer, ?, IntSummaryStatistics> collector = Collectors.summarizingInt(Integer::intValue);

        IntSummaryStatistics summaryStatistics = listOfIntegers.stream().collect(collector);

        System.out.println("Total = " + summaryStatistics.getSum());
        System.out.println("Overage = " + summaryStatistics.getAverage());

        int sum = listOfIntegers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        sum = listOfIntegers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("\nExample 3 page 15/21: ");

        Consumer<Integer> myConsumer = n -> {
            System.out.println("User input value = " + n);
            if (n < 5) {
                System.out.println("Invalid value");
                return;
            }
            listOfIntegers.add(n);

            showList(listOfIntegers);
        };
        myConsumer.accept(1000);

        System.out.println("\nExample 4 page 16/21: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input a number: ");
            int value = scanner.nextInt();
            myConsumer.accept(value);
            System.out.println();
            if (value == -1234)
                break;
        }

        System.out.println("\nExample 5 page 17/21: ");
        Predicate<Integer> tester = v -> v > 5;
        Consumer<Integer> myConsumer2 = n -> {
            listOfIntegers.add(n);
            showList(listOfIntegers);
        };
        while (true) {
            System.out.println("\nPlease input a number: ");
            int value = scanner.nextInt();
            if (value < 0) break;
            if (tester.test(value)) myConsumer2.accept(value);
        }
        listOfIntegers.forEach(x -> System.out.println(x + " - "));
    }

    static void showList(List<Integer> integerList) {
        System.out.println("Values: ");
        integerList.forEach(x ->
                System.out.print(x + " - ")
        );
    }
}
