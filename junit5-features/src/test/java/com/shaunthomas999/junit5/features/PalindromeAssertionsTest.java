package com.shaunthomas999.junit5.features;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class PalindromeAssertionsTest {

  @Test
  void standardAssertions() {
    assertTrue(isPalindrome("racecar"));
  }

  @Test
  void groupedAssertions() {
    // In a grouped assertion all assertions are executed, and all
    // failures will be reported together.
    assertAll("Grouped Assertions",
        () -> assertTrue(isPalindrome("racecar")),
        () -> assertTrue(isPalindrome("radar"))
    );
  }

  @Test
  void dependentAssertions() {
    // Within a code block, if an assertion fails the
    // subsequent code in the same block will be skipped.
    assertAll("Dependent Assertions",
        () -> {
          assertTrue(true);

          // Executed only if the previous assertion is valid.
          assertAll("Grouped Assertions",
              () -> assertTrue(isPalindrome("racecar")),
              () -> assertTrue(isPalindrome("radar"))
          );
        },
        () -> {
          // Grouped assertion, so processed independently
          // of results of first Grouped Assertions
          assertFalse(false);

          // Executed only if the previous assertion is valid.
          assertAll("Another Grouped Assertions",
              () -> assertFalse(isPalindrome("raceca")),
              () -> assertFalse(isPalindrome("rada"))
          );
        }
    );
  }
}
