package com.shaunthomas999.junit5.features;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
//@SelectPackages("com.shaunthomas999.junit5.features")
//public class PalindromeUnitTestSuite {
//}

@RunWith(JUnitPlatform.class)
@SelectClasses({PalindromeAssertionsTest.class, PalindromeAssumptionsTest.class})
public class PalindromeUnitTestSuite {
}


//@RunWith(JUnitPlatform.class)
//@SelectPackages("com.shaunthomas999.junit5.features")
//@IncludeTags("palindrome")
//public class PalindromeUnitTestSuite {
//}

