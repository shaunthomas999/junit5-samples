package com.shaunthomas999.junit5.features;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeDynamicTest {

  @TestFactory
  Stream<DynamicTest> dynamicTest() {
    String[] testValues = {"racecar", "radar", "able was I ere I saw elba"};

    return Arrays.stream(testValues)
        .map(candidate ->
            DynamicTest.dynamicTest("Checking " + candidate, () -> assertTrue(isPalindrome(candidate))
            )
        );
  }

  @TestFactory
  Stream<DynamicTest> dynamicMixedTest() {
    // Input generator
    String[] testValuesMixed = {"racecar", "race", "radar", "rada"};
    Iterator<String> inputGenerator = Arrays.asList(testValuesMixed).iterator();

    // Display name generator
    Function<String, String> displayNameGenerator = (input) -> "input: " + input;

    // Test executor
    ThrowingConsumer<String> testExecutor = (input) -> {
      if (input.length() % 2 == 0) {
        assertFalse(isPalindrome(input));
      } else {
        assertTrue(isPalindrome(input));
      }
    };

    return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor);
  }
}
