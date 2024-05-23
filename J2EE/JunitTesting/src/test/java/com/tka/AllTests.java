package com.tka;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ArithmeticTest.class, DbTest.class })
public class AllTests {

}
