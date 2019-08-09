package com.shaunthomas999;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.shaunthomas999.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

  @ParameterizedTest
  @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
  void isPalindromeParameterizedTest(String candidate) {
    assertTrue(isPalindrome(candidate));
  }
}
