package com.day7.packageDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHelper {
    public static String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }
    
    public static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
