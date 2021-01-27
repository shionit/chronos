package com.github.shionit.chronos.misc;

/**
 * Do FizzBuzz.
 */
public class FizzBuzz {

  private static final int FIZZ_NUM = 3;
  private static final int BUZZ_NUM = 5;
  private static final int FIZZ_BUZZ_NUM = FIZZ_NUM * BUZZ_NUM;

  /**
   * Fizz Buzz method
   * @param input inputNumber
   * @return FizzBuzz answer
   */
  public static String fizzBuzz(int input) {
    if (input % FIZZ_BUZZ_NUM == 0) {
      return "FizzBuzz";
    } else if (input % FIZZ_NUM == 0) {
      return "Fizz";
    } else if (input % BUZZ_NUM == 0) {
      return "Buzz";
    }
    return String.valueOf(input);
  }
}
