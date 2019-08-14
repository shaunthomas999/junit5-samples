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

    log.info("Starting test");

    // Decides whether to proceed with test execution
    assumeTrue(enableAssume);

    log.info("Proceeding test");

    // Lambda will be executed if condition is met
    assumingThat(!enableAssume,
        () -> {
          assertTrue(true);
          log.info("Asserted true");
        });

    // Will be executed if the first assumption (assumeTrue) is met
    assertFalse(false);

    log.info("Asserted false");
  }
}
