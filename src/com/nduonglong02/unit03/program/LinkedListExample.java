package com.nduonglong02.unit03.program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        args = new String[] {"he", "lo"};
        List<String> list = new LinkedList<String>();
        for (String ele : args) {
            list.add(ele);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("===>" + iterator.next());
        }
    }
}
