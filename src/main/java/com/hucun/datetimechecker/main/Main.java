/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hucun.datetimechecker.main;

/**
 *
 * @author ASUS
 */
import com.hucun.datetimechecker.core.DateTimeChecker;

import java.time.LocalDate;
import java.time.Month;

public class Main {

  
  

    public static void main(String[] args) {
      if(DateTimeChecker.isValidDate("2", "20", "2002")) System.out.println("Date is valid");
      else System.out.println("Not valid date");
    }
}
