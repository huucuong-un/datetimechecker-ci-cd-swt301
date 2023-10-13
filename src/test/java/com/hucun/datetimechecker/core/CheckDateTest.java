/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hucun.datetimechecker.core;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



/**
 *
 * @author ASUS
 */

public class CheckDateTest {


    //tc15
    //Cương
    //Test a year that is greater than year 3000 (maximum year can input) -- 27/04/3001
    @Test
    public void testIsValidDateGivenWrongArgumentWithYearGreaterThanMaxYearCanBeInputReturnsFalse(){
        assertEquals(false, DateTimeChecker.isValidDate("27", "04", "3001"));
    }

    //tc16
    //Cương
    //Test a year that is within the range of 1000 to 3000 -- 27/04/2009
    @Test
        public void testIsValidDateGivenRightArgumentWithYearInRangeOf1000To3000ReturnsTrue() { //expected: true
        assertEquals(true, DateTimeChecker.isValidDate("27", "4", "2009"));
    }


    //tc17
    //Cương
    //Test a day that is greater than 29 in February in a leap year -- 30/2/2000
    @Test
    public void testIsValidDateGivenWrongArgumentWithDayGreaterThanMaxDayInFebruaryInLeafYearReturnsFalse() {
        assertEquals(false, DateTimeChecker.isValidDate("30", "2", "2000"));
    }

    //tc18
    //Cương
    //Test a day greater than 30 in months of  4, 6, 9 and  11
    @Test
    public void testIsValidDateGivenWrongArgumentWithDayGreaterThanMaxDayInAprilReturnsFalse() {
        assertEquals(false, DateTimeChecker.isValidDate("31", "4", "2000"));

    }

    //tc19
    //Cương
    //Test a day that is equal to 31 in months of 1, 3, 5, 7, 8, 10 and 12
    @Test
    public void testIsValidDateGivenRightArgumentWithMaxDayInJanuaryReturnsTrue() {
        assertEquals(true, DateTimeChecker.isValidDate("31", "1", "2000"));

    }



    //tc1
    //Thành
    //Test a day that is a character
    @Test
    public void testIsValidDateGivenWrongArgumentWithDayIsACharacterReturnsFalse() {
        assertEquals(false, DateTimeChecker.isValidDate("a", "2", "2000"));
    }

    //tc2
    //Thành
    @Test
    //Test a month that is a character
    public void testIsValidDateGivenWrongArgumentWithMonthIsACharacterReturnsFalse() {
        assertEquals(false, DateTimeChecker.isValidDate("27", "a", "2000"));
    }

    //tc3
    //Thành
    @Test
    //Test a year that is a character
    public void testIsValidDateGivenWrongArgumentWithYearIsACharacterReturnsFalse() {
        assertEquals(false, DateTimeChecker.isValidDate("27", "2", "a"));
    }

    //tc14
    //Thành
    @Test
    //Test a year that is less than year 1000 (minimum year)
    public void testIsValidDateGivenWrongArgumentWithYearLessThan1000ReturnsFalse(){
        assertEquals(false, DateTimeChecker.isValidDate("27", "4", "999"));
    }

    //tc23
    //Thành
    @Test
    //Test a month is lower than 1
    public void testIsValidDateGivenWrongArgumentWithMonthLowerThan1ReturnsFalse(){
        assertEquals(false, DateTimeChecker.isValidDate("31", "0", "2000"));
    }

    //tc21
    //Thành
    @Test
    //Test a month is a special character
    public void testIsValidDateGivenWrongArgumentWithMonthIsASpecialCharacterReturnsFalse(){
        assertEquals(false, DateTimeChecker.isValidDate("31", "$", "2000"));
    }
    //tc8
    //Nam
    //Test a day that is greater than 31
    @Test
    public void testIsValidDateGivenDayThatIsGreaterThan31GivenIncorrectArgumentReturnFalse(){
        assertEquals(false,DateTimeChecker.isValidDate("32","5","2000"));
    }
    //tc9
    //Nam
    //Test a day that is a correct date
    @Test
    public void testIsVaLidDateGivenCorrectArgumentReturnTrue(){
        assertEquals(true, DateTimeChecker.isValidDate("1","1","2020"));
    }
    //tc10
    //Nam
    // Test a date that's Leap Year return true
    @Test
    public void testIsValidDateThatIsALeapYearGivenCorrectArgumentReturnTrue(){
        assertEquals(true, DateTimeChecker.isValidDate("29","2","2000"));
    }

    //tc11
    //Nam
    // Test a date that's Leap Year return false
    @Test
    public void testIsValidDateGivenYearThatIsALeapYearGivenIncorrectArgumentReturnFalse() {
        assertEquals(false,DateTimeChecker.isValidDate("29","2","2001"));

    }

    //tc12
    //Nam
    //Test a date that's minimum year return true
    @Test
    public void testIsValidDateGivenYearThaIsAMinimumYearGivenCorrectArgumentReturnWell(){
        assertEquals(true,DateTimeChecker.isValidDate("5","5","1000"));
    }


    //Vinh

//5.Test a month that is empty
    @Test
    public void testIsValidDateGivenWrongAgrumentWithAMonthIsEmptyReturnsFalse(){
        assertEquals(false,  DateTimeChecker.isValidDate("29", "", "2000"));
    }

    //Vinh
//6.Test a day that is lower than 1(minimum day)
        @Test
    public void testIsValidDateGivenWrongAgrumentWithADayIsLowerThan1ReturnsFalse(){
            assertEquals(false, DateTimeChecker.isValidDate("0", "4", "2000"));
    }

//Vinh
//7.Test a year that is empty
    @Test
    public void testIsValidDateGivenWrongAgrumentWithYearThatIsEmptyReturnsFalse(){
        assertEquals(false, DateTimeChecker.isValidDate("0", "4", ""));
    }

//    Bao
//    20. Test a day that is a special characters
    @Test
    public void TestADayThatIsASpecialCharacter(){
        assertEquals(false, DateTimeChecker.isValidDate("$", "5", "2000"));
    }
//    21. Test a month that is a special characters
    @Test
    public void TestAMonthThatIsASpecialCharacter(){
        assertEquals(false, DateTimeChecker.isValidDate("5", "$", "2000"));
    }
//    22. Test a year that is a special characters
    @Test
    public void TestAYearThatIsASpecialCharacter(){
        assertEquals(false, DateTimeChecker.isValidDate("2", "5", "$"));
    }
//    23. Test a month that is lower than 1(minimum month)
    @Test
    public void TestAMontThatIsLowerThan1(){
        assertEquals(false, DateTimeChecker.isValidDate("2", "0", "2000"));

    }
//    24. Test a month that is greater than 12(maximum month)
    @Test
    public void TestAMontThatIsGreaterThan12(){
        assertEquals(false, DateTimeChecker.isValidDate("2", "15", "2020"));

    }

}
