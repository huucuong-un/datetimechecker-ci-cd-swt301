package com.hucun.datetimechecker.core;



import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DayInMonthTest {


    //tc4 Tháng 2 năm 2000 trả về 29 (chia hết cho 400)
    //vinh
    @Test
    public void testDayInMonthGivenRightArgumentWithFebruaryAndLeapYearReturns29(){

        assertEquals(29, DateTimeChecker.dayInMonth("2","2000"));
    }

    //tc5. Tháng 2 năm 2001 trả về 28
    //vinh
    @Test
    public void testDayInMonthGivenRightArgumentWithFebruaryAndNoneLeapYearReturns28(){

        assertEquals(28, DateTimeChecker.dayInMonth("2","2001"));
    }
    //tc 6  Tháng 2 năm 2008 trả về 29 (không chia hết cho 100 nhưng chia hết cho 4)

    @Test
    public void testDayInMonthGivenRightArgumentWithFebruaryAndLeapYearWhichNotDivisibleFor100AndDivisibleFor4Returns28(){

        assertEquals(29, DateTimeChecker.dayInMonth("2","2008"));
    }


    //CCCCCCCCCCCCCCCCCCUUUUUUUUUUUOOOOOOOOOOOOONNNNNNNNNGGGGGGGGGGGGGGGGGGGGGGGGGGGGG

    //tc13
    //Cương
    //Test valid month with character year 'a' return 0
    @Test
    public void testDayInMonthGivenWrongArgumentWithValidMonthAndCharacterYearReturns0() {
        assertEquals(0, DateTimeChecker.dayInMonth("1", "a"));
    }

    //tc14
    //Cương
    //Test valid month with SPECIAL character year '$' return 0
    @Test
    public void testDayInMonthGivenWrongArgumentWithValidMonthAndSpecialCharacterYearReturns0() {
        assertEquals(0, DateTimeChecker.dayInMonth("1", "$"));
    }

    //tc15
    //Cương
    //Test valid month with empty year return 0
    @Test
    public void testDayInMonthGivenWrongArgumentWithValidMonthAndEmptyYearReturns0() {
        assertEquals(0, DateTimeChecker.dayInMonth("1", ""));
    }

    //tc16
    //Cương
    //Test valid month with year which is lower than minimum year can be input '999' return 0
    @Test
    public void testDayInMonthGivenWrongArgumentWithValidMonthAndYearWhichIsLowerThanMinimumYearCanBeInputReturns0() {
        assertEquals(0, DateTimeChecker.dayInMonth("1", "999"));
    }

    //tc17
    //Cương
    //Test valid month with year which is greater than maximum year can be input '3001' return 0

    @Test
    public void testDayInMonthGivenWrongArgumentWithValidMonthAndYearWhichIsGreaterThanMaximumYearCanBeInputReturns0() {
        assertEquals(0, DateTimeChecker.dayInMonth("1", "3001"));
    }




    //CCCCCCCCCCCCCCCCCCUUUUUUUUUUUOOOOOOOOOOOOONNNNNNNNNGGGGGGGGGGGGGGGGGGGGGGGGGGGGG


    //tc1
    //Thành
    //Test a valid month with a valid year return 31
    @Test
    public void testDayInMonthGivenRightArgumentWithMinimumValidMonthAndValidYearReturn31() {
        assertEquals(31, DateTimeChecker.dayInMonth("1", "2000"));
    }

    //tc2
    //Thành
    //Test a valid month with a valid year return 31
    @Test
    public void testDayInMonthGivenRightArgumentWithMaximumMonthAndValidYearReturn31() {
        assertEquals(31, DateTimeChecker.dayInMonth("12", "2000"));
    }

    //tc3
    //Thành
    //Test a valid month with a valid year return 31
    @Test
    public void testDayInMonthGivenRightArgumentWithValidMonthReturn30() {
        assertEquals(30, DateTimeChecker.dayInMonth("4", "2000"));

    }


//    Bao
//    7. Test valid month with year 1900
    @Test
    public void testDayInMonthGivenRightArgumentWithValidMonthAndValidYearReturn28() {
        assertEquals(28, DateTimeChecker.dayInMonth("2", "1900"));
    }
//    8. Test month is 0 that return 0
    @Test
    public void testDayInMonthGivenFalseArgumentWithMonthIs0AndValidYearReturn0(){
        assertEquals(0, DateTimeChecker.dayInMonth("0", "2000"));
    }
//    9. Test month is 13 that return 0
    @Test
    public void testDayInMonthGivenFalseArgumentWithIMonthIs13AndValidYearReturn0(){
        assertEquals(0, DateTimeChecker.dayInMonth("13", "2000"));
    }




//tc10
//Nam
// Tháng 'a' năm bất kì trả về 0
@Test
public void testDayInMonthGivenWrongArgumentWithMonthIsACharacterReturn0(){
    assertEquals(0, DateTimeChecker.dayInMonth("a", "2001"));

}
//tc11
//Nam
//Tháng '$' năm bất kì trả về 0
@Test
public void testDayInMonthGivenWrongArgumentWithMonthIsASpecialCharacterReturn0(){
    assertEquals(0, DateTimeChecker.dayInMonth("$", "2001"));

}
//tc12
//Nam
//Tháng '' năm bất kì trả về 0
@Test
public void testDayInMonthGivenWrongArgumentWithMonthIsEmptyReturn0(){
    assertEquals(0, DateTimeChecker.dayInMonth("", "2001"));
}
















































}