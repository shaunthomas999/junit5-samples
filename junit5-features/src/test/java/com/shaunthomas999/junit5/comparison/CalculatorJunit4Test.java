package com.shaunthomas999.junit5.comparison;

import lombok.extern.java.Log;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

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

  @Ignore("This test is simply ignored")
  @Test
  public void add() {
    assertEquals(3, calculator.add(1, 2));
  }

  @Test
  public void divideNormal() {
    assertEquals("8/4 = 2", 2, calculator.divide(8, 4));
  }

  @Test(expected = ArithmeticException.class)
  public void divideBy0_1() {
    calculator.divide(8, 0);
  }

  // -- start

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void divideBy0_2() {

    thrown.expect(ArithmeticException.class);
    thrown.expectMessage("/ by zero");

    calculator.divide(8, 0);
  }

  // -- end

  @Test(timeout=1000)
  public void fibonacci_1() {
    calculator.fibonacci(10); // will timeout for n = 42
  }

  // -- start

  @Rule
  public Timeout globalTimeout = Timeout.seconds(1);

  @Test
  public void fibonacci_2() {
    calculator.fibonacci(10); // will timeout for n = 42
  }

  // -- end
}
