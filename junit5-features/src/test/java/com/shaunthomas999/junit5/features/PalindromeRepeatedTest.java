package com.shaunthomas999.junit5.features;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static com.shaunthomas999.junit5.features.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class PalindromeRepeatedTest {

  @RepeatedTest(3)
//  @RepeatedTest(value = 3, name = "Method {displayName} is running {currentRepetition} of {totalRepetitions}")
  void  repeatedTest(RepetitionInfo repetitionInfo) {
    String[] testValues = {"racecar", "radar", "able was I ere I saw elba"};

    int currentRepetition = repetitionInfo.getCurrentRepetition();
    int totalRepetitions = repetitionInfo.getTotalRepetitions();

    String candidate = testValues[currentRepetition-1];

//    FIXME
//    log.info("Checking for string: " + candidate);
    System.out.println("Checking for string: " + candidate);

    assertTrue(isPalindrome(candidate));
  }
}
