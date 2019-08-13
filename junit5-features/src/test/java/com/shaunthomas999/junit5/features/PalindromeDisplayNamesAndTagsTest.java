package com.shaunthomas999.junit5.features;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

@Tag("palindrome")
@DisplayName("Tests for Palindrome class")
class PalindromeDisplayNamesAndTagsTest {

  @Test
  @DisplayName("✋ Test for palindrome and it workz ⛵")
  void test() {
    assertTrue(isPalindrome("racecar"));
  }
}
