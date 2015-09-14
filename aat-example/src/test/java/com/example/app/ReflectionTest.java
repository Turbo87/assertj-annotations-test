package com.example.app;

import org.assertj.annotation.Assertion;
import org.junit.Test;
import org.reflections.Reflections;

public class ReflectionTest {

    @Test
    public void print() {
        Reflections reflections = new Reflections();
        for (Class<?> annotatedType : reflections.getTypesAnnotatedWith(Assertion.class)) {
            System.out.printf("%s\n", annotatedType);
        }
    }
}
