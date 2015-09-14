package com.example.lib.assertions;

import org.junit.Test;

import static org.junit.Assert.fail;

public class LongAssertTest {
    @Test
    public void test() {
        LongAssert longAssert = new LongAssert(5L);

        longAssert.isEqualTo(5L);

        try {
            longAssert.isEqualTo(6L);
            fail("Should have failed!");
        } catch (AssertionError ignored) {}
    }
}
