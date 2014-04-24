package org.ayaseeli.someday.lib.cron;

import junit.framework.TestCase;

public class OperatorTest extends TestCase {
    public void testEveryOperator() {
        Operator operator = new Operator("*");
        assertEquals(operator.calculateNext(1), 1);
        assertEquals(operator.calculateInterval(), 1);
    }
}
