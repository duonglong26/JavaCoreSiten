package com.nduonglong02.unit02.program;

public class SaiSoException extends Exception {
    private String so;

    public SaiSoException(String value) {
        this.so = value;
    }

    public String getMessage() {
        return "Gia tri \'" + so + "\' khong phai la so!";
    }
}
