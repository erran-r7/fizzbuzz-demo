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
    boolean divisibleBy3 = (number % 3) == 0;
    boolean divisibleBy5 = (number % 5) == 0;

    String output = "";

    if (divisibleBy3) { output += "Fizz"; }
    if (divisibleBy5) { output += "Buzz"; }
    if (output.isEmpty()) { output += Integer.toString(number); }

    return output;
  }
}
