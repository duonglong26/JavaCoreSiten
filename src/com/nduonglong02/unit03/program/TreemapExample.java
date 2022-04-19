package com.nduonglong02.unit03.program;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(3, "Nguyen Van A");
        map.put(1, "Nguyen Van B");
        map.put(2, "Nguyen Van C");
        map.put(4, "Nguyen Van X");

        System.out.println("Test 1:");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Test 2:");
        map.descendingKeySet().forEach(key -> {
            System.out.println("Key = " + key + ", value = " + map.get(key));
        });

    }
}
