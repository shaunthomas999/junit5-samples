package com.shaunthomas999.junit5.comparison;

import lombok.extern.java.Log;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Log
class CalculatorJunit5Test {

  private final Calculator calculator = new Calculator();

  @BeforeAll
  static void init() {
    log.info("BeforeAll");
  }

  @AfterAll
  static void shutDown() {
    log.info("AfterAll");
  }

  @BeforeEach
  void setUp() {
    log.info("BeforeEach");
  }

  @AfterEach
  void tearDown() {
    log.info("AfterEach");
  }

  @Disabled("This test is simply disabled")
  @Test
  void add() {
    assertEquals(3, calculator.add(1, 2));
  }

  @Test
  void divideNormal() {
    assertEquals(2, calculator.divide(8, 4), "8/4 = 2");
  }

  @Test
  void divideBy0() {
    Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0));
    assertEquals("/ by zero", exception.getMessage());
  }

  @DisplayName("experimental-feature")
  @Test
  @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS) // default seconds
  void fibonacci_1() {
    calculator.fibonacci(10); // will timeout for n = 42
  }

  @Test
  void fibonacci_2() {
    boolean result = assertTimeout(ofSeconds(1), () -> {
      calculator.fibonacci(10); // will timeout for n = 42
      return true;
    });

    assertTrue(result);
  }
}
