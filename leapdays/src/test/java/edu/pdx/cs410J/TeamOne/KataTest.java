package edu.pdx.cs410J.TeamOne;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void oddYearsAreNotLeapYears() {
    assertThat(Kata.isLeapYear(2001), equalTo(false));
    assertThat(Kata.isLeapYear(3333), equalTo(false));
  }
  
  @Test
  void yearDivisibleBy4ButNotBy100IsLeapYear() {
    assertThat(Kata.isLeapYear(1996), equalTo(true));
    assertThat(Kata.isLeapYear(4444), equalTo(true));
  }


  @Test
  void yearDivisibleBy400IsLeapYear() {
    assertThat(Kata.isLeapYear(2000), equalTo(true));
    assertThat(Kata.isLeapYear(2400), equalTo(true));
  }

  @Test
  void yearDivisibleBy100AndNot400IsNotLeapYear() {
    assertThat(Kata.isLeapYear(2100), equalTo(false));
    assertThat(Kata.isLeapYear(100), equalTo(false));
  }
}
