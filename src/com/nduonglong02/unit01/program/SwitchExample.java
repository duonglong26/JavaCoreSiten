package com.nduonglong02.unit01.program;

public class SwitchExample {
    public static void main(String[] args) {
        args = new String[]{"1"};
        int value = Integer.parseInt(args[0]);

        switch (value) {
            case 0:
                System.out.println("bad");
                break;
            case 1:
                System.out.println("ok");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
