package com.shaunthomas999;

import lombok.extern.java.Log;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

  @Test
  void divide() {
    assertEquals(2, calculator.divide(8, 4), "8/4 = 2");
  }

  @Test
  void fibonacci() {
  }
}
