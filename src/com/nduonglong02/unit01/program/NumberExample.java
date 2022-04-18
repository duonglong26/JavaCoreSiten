package com.nduonglong02.unit01.program;

public class NumberExample {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "3", "4"};

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[0]);

        System.out.println("Subtraction example: " + (number1 - number2));

        System.out.println("Relational example: " + (number1 > number2));
    }
}
