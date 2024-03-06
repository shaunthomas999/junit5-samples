package com.shaunthomas999.junit5.features;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@Slf4j
class PalindromeAssumptionsTest {

  @Test
  void assumptions() {
    final boolean enableAssume = true;

//    FIXME
//    log.info("Starting test");
    System.out.println("Starting test");

    // Decides whether to proceed with test execution
    assumeTrue(enableAssume);

//    FIXME
//    log.info("Proceeding test");
    System.out.println("Proceeding test");

    // Lambda will be executed if condition is met
    assumingThat(!enableAssume,
        () -> {
          assertTrue(true);
//          FIXME
//          log.info("Asserted true");
          System.out.println("Asserted true");
        });

    // Will be executed if the first assumption (assumeTrue) is met
    assertFalse(false);

//    FIXME
//    log.info("Asserted false");
    System.out.println("Asserted false");
  }
}
