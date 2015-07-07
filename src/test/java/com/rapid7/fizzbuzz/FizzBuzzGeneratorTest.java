/***************************************************************************
 * COPYRIGHT (C) 2015, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/

package com.rapid7.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A simple FizzBuzzGenerator.
 */
public class FizzBuzzGeneratorTest {
  @Before
  public void setup() {
    m_fizzbuzz = new FizzBuzzGenerator();
  }

  @Test
  public void testGenerateWith1() {
    assertEquals("1", m_fizzbuzz.generate(1));
  }

  @Test
  public void testGenerateWith2() {
    assertEquals("2", m_fizzbuzz.generate(2));
  }

  @Test
  public void testGenerateWith9() {
    assertEquals("Fizz", m_fizzbuzz.generate(9));
  }

  @Test
  public void testGenerateWith10() {
    assertEquals("10", m_fizzbuzz.generate(10));
  }

  @Test
  public void testGenerateWith15() {
    assertEquals("FizzBuzz", m_fizzbuzz.generate(15));
  }

  @Test
  public void testGenerateWith30() {
    assertEquals("FizzBuzz", m_fizzbuzz.generate(30));
  }

  @Test
  public void testGenerateWith41() {
    assertEquals("Buzz", m_fizzbuzz.generate(41));
  }

  public FizzBuzzGenerator m_fizzbuzz;
}
