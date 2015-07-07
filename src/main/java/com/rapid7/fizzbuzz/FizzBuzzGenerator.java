/***************************************************************************
 * COPYRIGHT (C) 2015, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/

package com.rapid7.fizzbuzz;

/**
 * A simple FizzBuzzGenerator.
 */
public class FizzBuzzGenerator {
  /**
   * @param number - the number to divide by
   * @return - Fizz if divisible by 3, Buzz if divisible by 5, and the number otherwise.
   */
  public String generate(int number) {

    boolean divisibleBy3 =false;
    boolean divisibleBy5 =false;
    boolean divisibleBy3and5 =false;

    if(number % 3 == 0) {
      divisibleBy3 = true;

       if (number %5 ==0)
          divisibleBy3and5 = true;

    }else if (number % 5 ==0) {
      divisibleBy5 =true;
    }



    String output = "";

    if (divisibleBy3==true) { output = "Fizz"; }
    if (divisibleBy5==true) { output = "Buzz"; }
    if (divisibleBy3and5==true) {output = "FizzBuzz";}




    if (output.isEmpty()) { output += Integer.toString(number); }

    return output;
  }
}
