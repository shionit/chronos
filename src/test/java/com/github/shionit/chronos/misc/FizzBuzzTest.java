package com.github.shionit.chronos.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Test class of {@code FizzBuzz}
 */
public class FizzBuzzTest {

  @ParameterizedTest
  @CsvSource({
      "1, 1, 入力値をそのまま返す",
      "2, 2, 入力値をそのまま返す",
      "3, Fizz, 3の倍数はFizzを返す",
      "4, 4, 入力値をそのまま返す",
      "5, Buzz, 5の倍数はBuzzを返す",
      "6, Fizz, 3の倍数はFizzを返す",
      "7, 7, 入力値をそのまま返す",
      "8, 8, 入力値をそのまま返す",
      "9, Fizz, 3の倍数はFizzを返す",
      "10, Buzz, 5の倍数はBuzzを返す",
      "11, 11, 入力値をそのまま返す",
      "12, Fizz, 3の倍数はFizzを返す",
      "13, 13, 入力値をそのまま返す",
      "14, 14, 入力値をそのまま返す",
      "15, FizzBuzz, 15の倍数はFizzBuzzを返す",
      "16, 16, 入力値をそのまま返す"
  })
  public void testFizzBuzz(int input, String expected) {
    assertEquals(FizzBuzz.fizzBuzz(input), expected);
  }

}
