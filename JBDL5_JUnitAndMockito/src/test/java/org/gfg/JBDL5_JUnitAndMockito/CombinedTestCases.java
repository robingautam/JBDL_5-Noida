package org.gfg.JBDL5_JUnitAndMockito;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, PersonTest.class})
public class CombinedTestCases {
}
