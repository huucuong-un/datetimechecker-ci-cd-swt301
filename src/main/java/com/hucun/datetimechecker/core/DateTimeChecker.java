/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hucun.datetimechecker.core;


import java.util.Scanner;

/**
 * @author ASUS
 */
public class DateTimeChecker {
    public static int dayInMonth(String monthString, String yearString) {
        String monthPattern = "^\\d+$";
        String yearPattern = "^\\d+$";
        if (!monthString.matches(monthPattern)) return 0;
        if (!yearString.matches(yearPattern)) return 0;
        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        try {
            int month = Integer.parseInt(monthString);
            int year = Integer.parseInt(yearString);
            if (year < 1000 || year > 3000) return 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                return 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
            if (month != 2) return 0;
            if (year % 400 == 0) return 29;
            if (year % 100 == 0) return 28;
            if (year % 4 == 0) return 29;


            return 28;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;

        }

    }

    public static boolean isValidDate(String dayString, String monthString, String yearString) {

        String dayPattern = "^\\d+$";
        String monthPattern = "^\\d+$";
        String yearPattern = "^\\d+$";
        if (!dayString.matches(dayPattern)) return false;
        if (!monthString.matches(monthPattern)) return false;
        if (!yearString.matches(yearPattern)) return false;


        try {
            int day = Integer.parseInt(dayString);
            int month = Integer.parseInt(monthString);
            int year = Integer.parseInt(yearString);
            if (month < 1 || month > 12) return false;
            if (day < 1) return false;
            if (day <= (dayInMonth(monthString, yearString))) return true;
            return false;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;

        }

    }
}

//    public static void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Day: ");
//        String dayString = sc.nextLine();
//        System.out.println();
//        System.out.print("Month: ");
//        String monthString = sc.nextLine();
//        System.out.println();
//        System.out.print("Year: ");
//        String yearString = sc.nextLine();
//        System.out.println();
//        System.out.println(CheckDateTimeChecker(dayString, monthString, yearString));
////        System.out.println(DateTimeCheckerInput(dayString, monthString, yearString));
//    }
//    public static String
//     CheckDateTimeChecker(String dayString, String monthString, String yearString) {
//
//
//
//
//        String dayPattern = "^\\d+$";
//        /*
//        * ^: Bắt đầu của chuỗi.
//        [0-9]: Đây là một dãy ký tự (khoảng từ 0 đến 9).
//        +: Ký tự trước đó (tức là từ 0 đến 9) có thể xuất hiện một hoặc nhiều lần.
//        $: Kết thúc của chuỗi.
//        * */
//
//        String monthPattern ="^\\d+$";
//        String yearPattern = "^\\d+$";
//        String msg ="";
//
//        if (!dayString.matches(dayPattern)) return msg = ("Input data for Day is incorrect format");
//        if(!monthString.matches(monthPattern)) return msg = ("Input data for Month is incorrect format!");
//        if(!yearString.matches(yearPattern)) return msg = ("Input data for Year is incorrect format!");
//
//        int day = Integer.parseInt(dayString);
//        if( day < 1 || day > 31) return msg = ("Input data for Day is out of range!");
//
//        int month = Integer.parseInt(monthString);
//        if( month < 1 || month > 12) return msg = ("Input data for Month is out of range!");
//
//        int year = Integer.parseInt(yearString);
//        if( year < 1000 || year > 3000) return msg = ("Input data for Year is out of range!");
//
//        if (isValidDate(day, month, year)) return msg = (day + "/" + month + "/" + year + " is correct date time!");
//        return msg = (day + "/" + month + "/" + year + " is NOT correct date time!");
//
//    }
//
//    public static String DateTimeCheckerInput(String dayString, String monthString, String yearString) {
//      int day =0;
//      int month =0;
//      int year =0;
//      String msg="";
//        try { ////
//            day = Integer.parseInt(dayString);
//
//
//        } catch (NumberFormatException ex) {
//             msg = "Input data for Day is incorrect format!";
//            throw new NumberFormatException(msg);
//        }
//
//        try {
//            month = Integer.parseInt(monthString);
//        } catch (NumberFormatException ex) {
//             msg = "Input data for Month is incorrect format!";
//            throw new NumberFormatException(msg);
//        }
//        try {
//            year = Integer.parseInt(yearString);
//        } catch (NumberFormatException ex) {
//             msg = "Input data for Year is incorrect format!";
//            throw new NumberFormatException(msg);
//        }
//
//        if(isValidDate(day, month, year)) {
//            msg = day + "/" + month + "/" + year + " is correct date time!";
//        } else {
//            msg = day + "/" + month + "/" + year + " is NOT correct date time!";
//        }
//            return msg;
//        }
//
//        }
