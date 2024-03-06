package com.shaunthomas999.junit5.comparison;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class CalculatorJunit5Test {

  private final Calculator calculator = new Calculator();

  @BeforeAll
  static void init() {
//  FIXME
//    log.info("BeforeAll");
    System.out.println("BeforeAll");
  }

  @AfterAll
  static void shutDown() {
    //  FIXME
//    log.info("AfterAll");
    System.out.println("AfterAll");
  }

  @BeforeEach
  void setUp() {
    //  FIXME
//    log.info("BeforeEach");
    System.out.println("BeforeEach");
  }

  @AfterEach
  void tearDown() {
    //  FIXME
//    log.info("AfterEach");
    System.out.println("AfterEach");
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

  /**
   * experimental-feature
   */
  @Test
  @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS) // default seconds
  void fibonacci_1() {
    calculator.fibonacci(10); // will timeout for n = 42
  }

  @Test
  void fibonacci_2() {
    boolean result = assertTimeout(ofSeconds(1), () -> {
//      FIXME
//      log.info("{}", calculator.fibonacci(10)); // will timeout for n = 42
      System.out.println(calculator.fibonacci(10));
      return true;
    });

    assertTrue(result);
  }
}
