package com.example.app.assertions;

import org.assertj.annotation.Assertion;

import java.util.UUID;

@Assertion
public class UUIDAssert {
    private final UUID actual;

    public UUIDAssert(UUID actual) {
        this.actual = actual;
    }

    public void isEqualTo(UUID expected) {
        if (!actual.equals(expected))
            throw new AssertionError("not the same");
    }
}
