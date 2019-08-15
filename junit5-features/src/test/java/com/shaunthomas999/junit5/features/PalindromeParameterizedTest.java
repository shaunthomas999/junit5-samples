package com.shaunthomas999.junit5.features;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeParameterizedTest {

  /**
   * experimental-feature
   */
  @ParameterizedTest
  @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
  void parameterizedTest(String candidate) {
    assertTrue(isPalindrome(candidate));
  }
}
