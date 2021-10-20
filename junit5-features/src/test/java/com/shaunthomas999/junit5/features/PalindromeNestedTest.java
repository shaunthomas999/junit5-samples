package com.shaunthomas999.junit5.features;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNestedTest {

  @Nested
  class IsPalindrome {

    @Test
    void isPalindromeTestShouldReturnTrueForPositiveCase() {
      assertTrue(isPalindrome("racecar"));
    }

    @Test
    void isPalindromeTestShouldReturnFalseForNegativeCase() {
      assertFalse(isPalindrome("race"));
    }
  }
}
