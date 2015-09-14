package com.example.app.assertions;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.fail;

public class UUIDAssertTest {
    @Test
    public void test() {
        UUID actual = UUID.randomUUID();
        UUIDAssert longAssert = new UUIDAssert(actual);

        longAssert.isEqualTo(actual);

        try {
            longAssert.isEqualTo(UUID.randomUUID());
            fail("Should have failed!");
        } catch (AssertionError ignored) {}
    }
}
