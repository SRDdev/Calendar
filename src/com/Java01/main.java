package com.Java01;
import java.util.Scanner;
//Calender Program
public class main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Press 't' to start and 'f' to stop");
            String start = in.next();
            if (start.equals("t")){
                System.out.println("Enter a Year");
                int year = in.nextInt();
                int rem = year % 4;
                switch (rem) {
                    case 0 -> {
                        System.out.println("Enter a month (only 3 letters)");
                        String month = in.next();
                        if (month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May") || month.equals("Jun") || month.equals("Jul") || month.equals("Aug") || month.equals("Sep") || month.equals("Oct") || month.equals("Nov") || month.equals("Dec")) {
                            switch (month) {
                                case "Jan" -> {
                                    System.out.println("Enter date in Jan");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println(" Sat");
                                        case 5, 12, 19, 26 -> System.out.println(" Sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Feb" -> {
                                    System.out.println("Enter date in Feb");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23 -> System.out.println("Sun");
                                        case 3, 10, 17, 24 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Mar" -> {
                                    System.out.println("Enter date in Mar");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("Sat");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Apr" -> {
                                    System.out.println("Enter date in Apr");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("Sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "May" -> {
                                    System.out.println("Enter date in May");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24, 31 -> System.out.println("sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jun" -> {
                                    System.out.println("Enter date in Jun");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println(" Monday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24 -> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("Sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jul" -> {
                                    System.out.println("Enter date in Jul");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("Sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Aug" -> {
                                    System.out.println("Enter date in Aug");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("sun");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Sep" -> {
                                    System.out.println("Enter date in Sep");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Tuesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Wednesday");
                                        case 3, 10, 17, 24 -> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Oct" -> {
                                    System.out.println("Enter date in Oct");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Nov" -> {
                                    System.out.println("Enter date in Nov");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("Sat");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Dec" -> {
                                    System.out.println("Enter date in Dec");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Tuesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Wednesday");
                                        case 3, 10, 17, 24 -> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        case 31 -> System.out.println("Thursday " + " O Happy Day ! O Happy Day !");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                            }
                        } else if (month.equals("x") || month.equals("X")) {
                            break;
                        } else {
                            System.out.println("Invalid Operation");
                        }
                    }
                    case 1 -> {
                        System.out.println("Enter a month (only 3 letters)");
                        Scanner input = new Scanner(System.in);
                        String month = in.next();
                        if (month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May") || month.equals("Jun") || month.equals("Jul") || month.equals("Aug") || month.equals("Sep") || month.equals("Oct") || month.equals("Nov") || month.equals("Dec")) {
                            switch (month) {
                                case "Jan" -> {
                                    System.out.println("Enter date in Jan");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Feb" -> {
                                    System.out.println("Enter date in Feb");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22 -> System.out.println("Monday");
                                        case 2, 9, 16, 23 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24 -> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("Sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Mar" -> {
                                    System.out.println("Enter date in Mar");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Monday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("Sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Apr" -> {
                                    System.out.println("Enter date in Apr");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("Sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "May" -> {
                                    System.out.println("Enter date in May");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("sun");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jun" -> {
                                    System.out.println("Enter date in Jun");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Tuesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Wednesday");
                                        case 3, 10, 17, 24 -> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("Sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jul" -> {
                                    System.out.println("Enter date in Jul");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("Sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Aug" -> {
                                    System.out.println("Enter date in Aug");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("Sat");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Sep" -> {
                                    System.out.println("Enter date in Sep");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Oct" -> {
                                    System.out.println("Enter date in Oct");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24, 31 -> System.out.println("sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Nov" -> {
                                    System.out.println("Enter date in Nov");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Monday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24 -> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Dec" -> {
                                    System.out.println("Enter date in Dec");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        case 31 -> System.out.println("Friday " + " O Happy Day ! O Happy Day !");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                            }
                        } else if (month.equals("x") || month.equals("X")) {
                            break;
                        } else {
                            System.out.println("Invalid Operation");
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter a month (only 3 letters)");
                        String month = in.next();
                        if (month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May") || month.equals("Jun") || month.equals("Jul") || month.equals("Aug") || month.equals("Sep") || month.equals("Oct") || month.equals("Nov") || month.equals("Dec")) {
                            switch (month) {// Sun Sat Friday Thursday Wednesday Tuesday Monday
                                case "Jan" -> {
                                    System.out.println("Enter date in Jan");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sun");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Feb" -> {
                                    System.out.println("Enter date in Feb");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22-> System.out.println("Tuesday");
                                        case 2, 9, 16, 23-> System.out.println("Wednesday");
                                        case 3, 10, 17, 24-> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("Sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Mar" -> {
                                    System.out.println("Enter date in Mar");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22 ,29-> System.out.println("Tuesday");
                                        case 2, 9, 16, 23 ,30-> System.out.println("Wednesday");
                                        case 3, 10, 17, 24 ,31-> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("Sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Apr" -> {
                                    System.out.println("Enter date in Apr");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24 -> System.out.println("sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "May" -> {
                                    System.out.println("Enter date in May");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("sat");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jun" -> {
                                    System.out.println("Enter date in Jun");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jul" -> {
                                    System.out.println("Enter date in Jul");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24, 31 -> System.out.println("sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Aug" -> {
                                    System.out.println("Enter date in Aug");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Monday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24 ,31-> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Sep" -> {
                                    System.out.println("Enter date in Sep");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Oct" -> {
                                    System.out.println("Enter date in Oct");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sun");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Nov" -> {
                                    System.out.println("Enter date in Nov");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Tuesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Wednesday");
                                        case 3, 10, 17, 24 -> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Dec" -> {
                                    System.out.println("Enter date in Dec");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("Sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        case 31 -> System.out.println("Sat "+ "O happy day! O happy day!");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                            }
                        } else if (month.equals("x") || month.equals("X")) {
                            break;
                        } else {
                            System.out.println("Invalid Operation");
                        }
                    }
                    case 3 -> {
                        System.out.println("Enter a month (only 3 letters)");
                        String month = in.next();
                        if (month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May") || month.equals("Jun") || month.equals("Jul") || month.equals("Aug") || month.equals("Sep") || month.equals("Oct") || month.equals("Nov") || month.equals("Dec")) {
                            switch (month) {// Sun Sat Friday Thursday Wednesday Tuesday Monday
                                case "Jan" -> {
                                    System.out.println("Enter date in Jan");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("Saturday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Feb" -> {
                                    System.out.println("Enter date in Feb");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("Sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Mar" -> {
                                    System.out.println("Enter date in Mar");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22 ,29-> System.out.println("Wednesday");
                                        case 2, 9, 16, 23 ,30-> System.out.println("Thursday");
                                        case 3, 10, 17, 24 ,31-> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("Sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Apr" -> {
                                    System.out.println("Enter date in Apr");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sun");
                                        case 3, 10, 17, 24 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }//
                                case "May" -> {
                                    System.out.println("Enter date in May");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Monday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Tuesday");
                                        case 3, 10, 17, 24 ,31-> System.out.println("Wednesday");
                                        case 4, 11, 18, 25 -> System.out.println("Thursday");
                                        case 5, 12, 19, 26 -> System.out.println("Friday");
                                        case 6, 13, 20, 27 -> System.out.println("Sat");
                                        case 7, 14, 21, 28 -> System.out.println("sun");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jun" -> {
                                    System.out.println("Enter date in Jun");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Thursday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Friday");
                                        case 3, 10, 17, 24 -> System.out.println("Sat");
                                        case 4, 11, 18, 25 -> System.out.println("sun");
                                        case 5, 12, 19, 26 -> System.out.println("Monday");
                                        case 6, 13, 20, 27 -> System.out.println("Tuesday");
                                        case 7, 14, 21, 28 -> System.out.println("Wednesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Jul" -> {
                                    System.out.println("Enter date in Jul");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sat");
                                        case 2, 9, 16, 23, 30 -> System.out.println("sun");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Monday");
                                        case 4, 11, 18, 25 -> System.out.println("Tuesday");
                                        case 5, 12, 19, 26 -> System.out.println("Wednesday");
                                        case 6, 13, 20, 27 -> System.out.println("Thursday");
                                        case 7, 14, 21, 28 -> System.out.println("Friday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Aug" -> {
                                    System.out.println("Enter date in Aug");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Tuesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Wednesday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Thursday");
                                        case 4, 11, 18, 25 -> System.out.println("Friday");
                                        case 5, 12, 19, 26 -> System.out.println("Sat");
                                        case 6, 13, 20, 27 -> System.out.println("sun");
                                        case 7, 14, 21, 28 -> System.out.println("Monday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Sep" -> {
                                    System.out.println("Enter date in Sep");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24 -> System.out.println("sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Oct" -> {
                                    System.out.println("Enter date in Oct");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Sun");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Monday");
                                        case 3, 10, 17, 24, 31 -> System.out.println("Tuesday");
                                        case 4, 11, 18, 25 -> System.out.println("Wednesday");
                                        case 5, 12, 19, 26 -> System.out.println("Thursday");
                                        case 6, 13, 20, 27 -> System.out.println("Friday");
                                        case 7, 14, 21, 28 -> System.out.println("Sat");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Nov" -> {
                                    System.out.println("Enter date in Nov");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println("Wednesday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Thursday");
                                        case 3, 10, 17, 24 -> System.out.println("Friday");
                                        case 4, 11, 18, 25 -> System.out.println("Sat");
                                        case 5, 12, 19, 26 -> System.out.println("sun");
                                        case 6, 13, 20, 27 -> System.out.println("Monday");
                                        case 7, 14, 21, 28 -> System.out.println("Tuesday");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                                case "Dec" -> {
                                    System.out.println("Enter date in Dec");
                                    int day = in.nextInt();
                                    switch (day) {
                                        case 1, 8, 15, 22, 29 -> System.out.println(" Friday");
                                        case 2, 9, 16, 23, 30 -> System.out.println("Sat");
                                        case 3, 10, 17, 24 -> System.out.println("Sun");
                                        case 4, 11, 18, 25 -> System.out.println("Monday");
                                        case 5, 12, 19, 26 -> System.out.println("Tuesday");
                                        case 6, 13, 20, 27 -> System.out.println("Wednesday");
                                        case 7, 14, 21, 28 -> System.out.println("Thursday");
                                        case 31 -> System.out.println("Sun " + "O happy day ! O happy day!");
                                        default -> System.out.println("enter a valid date of the month");
                                    }
                                }
                            }
                        } else if (month.equals("x") || month.equals("X")) {
                            break;
                        } else {
                            System.out.println("Invalid Operation");
                        }
                    }
                }
            }
            else break;
        }
    }
}

