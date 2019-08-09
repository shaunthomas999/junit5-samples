package com.shaunthomas999;

import lombok.extern.java.Log;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Log
public class CalculatorJunit4Test {

  private final Calculator calculator = new Calculator();

  @BeforeClass
  public static void init() {
    log.info("BeforeClass");
  }

  @AfterClass
  public static void shutDown() {
    log.info("AfterClass");
  }

  @Before
  public void setUp() {
    log.info("Before");
  }

  @After
  public void tearDown() {
    log.info("After");
  }

  @Test
  public void divide() {
    assertEquals("8/4 = 2", 2, calculator.divide(8, 4));
  }

  @Test
  public void fibonacci() {
  }
}
