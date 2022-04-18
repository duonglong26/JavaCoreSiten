package com.nduonglong02.unit02.program;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CharacterExample {
    private static int count(String value, String type) {
        int i = 0, counterDigit = 0, counterWhiteSpace = 0;
        while (i < value.length()) {
            char c = value.charAt(i);
            if (Character.isDigit(c))
                counterDigit++;
            else if (Character.isWhitespace(c))
                counterWhiteSpace++;
            i++;
        }
        switch (type) {
            case "digit":
                return counterDigit;
            case "whiteSpace":
                return counterWhiteSpace;
            default:
                return 0;
        }
    }

    private static int countDigit(String value) { // test 2
        AtomicInteger counter = new AtomicInteger(0);
        IntStream stream = value.chars();
        stream.forEach(c -> {
            if (Character.isDigit(c))
                counter.incrementAndGet();
        });
        return counter.get();
    }

    public static void main(String[] args) {
        args = new String[]{"abc1 23 4"};
        System.out.println("There are " + count(args[0], "whiteSpace") + " white space in the text.");
        System.out.println("There are " + count(args[0], "digit") + " digits in the text.");

        System.out.println("Test 2: count digit using AtomicInteger");
        System.out.println("There are " + countDigit(args[0]) + " digits in the text.");
    }
}
