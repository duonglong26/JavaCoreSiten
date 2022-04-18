package com.nduonglong02.unit02.program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTImeFormatExample {
    public static void main(String[] args) {
        Locale locale = new Locale("vi", "VN");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, dd MMMMMM yyyy", locale);

        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
