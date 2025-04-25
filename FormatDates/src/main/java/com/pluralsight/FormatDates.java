package com.pluralsight;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();



        System.out.println("---------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        System.out.println(today.format(formatter));
        System.out.println(today);
        System.out.println(today.format(formatter2));
        System.out.println(today.format(formatter3));
        

    }
}
