package com.nduonglong02.unit06.program;

public class ThreadTest {
    public static void main(String[] args) {
//        PrintMessage message = new PrintMessage("Say hello to everyone");
        new Thread(new PrintMessage("Say hello to everyone")).start();
        new Thread(new PrintMessage("Say hello to everyone")).start();
    }
}
