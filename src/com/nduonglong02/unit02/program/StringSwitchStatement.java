package com.nduonglong02.unit02.program;

import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {

    public static void main(String[] args) {
        StringSwitchStatement statement = new StringSwitchStatement();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Today is " + statement.getTypeOfDay(calendar));

        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        System.out.println("Tomorrow is " + statement.getTypeOfDay(calendar));
    }

    String getTypeOfDay(Calendar calendar) {
        String type = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));
        System.out.println(type);

        switch (type) {
            case "Th 2" :
                return "Start of work week";
            case "Th 3":
            case "Th 4":
            case "Th 5":
            case "Th 6":
                return "Midweek";
            case "Th 7" :
                return "End of work week";
            case "CN":
                return "Weekend";
        }
        return "Unknown";
    }
}
