package com.shaunthomas999.junit5.features;

import org.junit.jupiter.api.*;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNestedTest {

  @BeforeAll
  static void setup() {
    System.out.println("before all - super");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("before each - super");
  }

  @AfterEach
  void afterEach() {
    System.out.println("after each - super");
  }

  @AfterAll
  static void teardown() {
    System.out.println("after all - super");
  }

  @Nested
  class IsPalindrome {

//    @BeforeAll
//    static void setup() {
//      System.out.println("before all - super");
//    }

    @BeforeEach
    void beforeEach() {
      System.out.println("before each - inner-1");
    }

    @AfterEach
    void afterEach() {
      System.out.println("after each - inner-1");
    }

//    @AfterAll
//    static void teardown() {
//      System.out.println("after all - super");
//    }

    @Test
    void isPalindromeTestShouldReturnTrueForPositiveCase() {
      assertTrue(isPalindrome("racecar"));
    }

    @Test
    void isPalindromeTestShouldReturnFalseForNegativeCase() {
      assertFalse(isPalindrome("race"));
    }
  }

  @Nested
  class IsPalindrome2 {

    @BeforeEach
    void beforeEach() {
      System.out.println("before each - inner-2");
    }

    @AfterEach
    void afterEach() {
      System.out.println("after each - inner-2");
    }

    @Test
    void test1() {
      System.out.println("test1 - inner-2");
    }
  }
}
