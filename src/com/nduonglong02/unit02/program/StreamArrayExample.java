package com.nduonglong02.unit02.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.nduonglong02.unit02.utils.ArrayUtils.showArray;

public class StreamArrayExample {
    public static void main(String[] args) {
        Integer[] values = {2, 4, 7, 1, 3, 5, 9, 11, 3};
        Arrays.sort(values, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

        showArray(values);

        Stream <Integer> stream = Arrays.stream(values);

        Predicate<Integer> predicate = (Integer value) -> {
            return value > 5;
        };

        Stream<Integer> older = stream.filter(predicate);

        System.out.println("Value > 5:");
        older.forEach((Integer value) -> {
            System.out.println(value);
        });

        List<Integer> valueList = Arrays.asList(2, 4, 7, 1, 3, 5, 9, 11, 3);
        Optional<Integer> max = valueList.stream().max(Comparator.
                comparing(Integer::valueOf));

        System.out.println("Gia tri lon nhat = " + max.get());

    }
}
