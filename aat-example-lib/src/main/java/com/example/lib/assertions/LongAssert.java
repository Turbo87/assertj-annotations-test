package com.example.lib.assertions;

import org.assertj.annotation.Assertion;

@Assertion
public class LongAssert {
    private final Long actual;

    public LongAssert(long actual) {
        this.actual = actual;
    }

    public LongAssert(Long actual) {
        this.actual = actual;
    }

    public void isEqualTo(Long expected) {
        if (!actual.equals(expected))
            throw new AssertionError("not the same");
    }

    public void isEqualTo(long expected) {
        isEqualTo((Long) expected);
    }
}
