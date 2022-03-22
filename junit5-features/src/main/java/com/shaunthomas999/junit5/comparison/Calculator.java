package com.shaunthomas999.junit5.comparison;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  /**
   * Ref: https://en.wikipedia.org/wiki/Fibonacci_number
   * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
   */
  public int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
