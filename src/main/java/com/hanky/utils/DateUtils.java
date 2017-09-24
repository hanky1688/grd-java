package com.hanky.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String getTransDate(){
        final LocalDate date = LocalDate.now();
        return date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

    }

    public static void main(String[] args) {
        String transDate = DateUtils.getTransDate();
        System.out.println(transDate);
    }


}
