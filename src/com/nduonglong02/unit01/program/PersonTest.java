package com.nduonglong02.unit01.program;

import com.nduonglong02.unit01.entity.Person;

public class PersonTest {
    public static void main(String[] args) {
        args = new String[] {"Duong Long", "Ket"};
        Person person1 = new Person(args[0]);
        Person person2 = new Person((args[1]));

        System.out.println("Person 1's name is " + person1.getName());
        System.out.println("Person 2's name is " + person2.getName());
    }
}
