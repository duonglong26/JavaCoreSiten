package com.nduonglong02.unit02.program;

public class SystemExample {
    public static void main(String[] args) {
        System.out.println("JAVA_HOME=" + System.getProperty("java.home"));
        System.setProperty("java.home", "C:\\Users\\HP\\.jdks\\corretto-11.0.12");

        System.out.println("JAVA_HOME=" + System.getProperty("java.home"));

        System.out.println("User=" + System.getProperty("user.name"));
    }
}
