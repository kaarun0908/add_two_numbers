package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddPositiveNumbers() {
        assertEquals(30, App.add(10, 20), "10 + 20 should equal 30");
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-15, App.add(-5, -10), "-5 + -10 should equal -15");
    }

    @Test
    void testAddPositiveAndNegative() {
        assertEquals(5, App.add(15, -10), "15 + -10 should equal 5");
    }

    @Test
    void testAddZero() {
        assertEquals(7, App.add(7, 0), "7 + 0 should equal 7");
        assertEquals(0, App.add(0, 0), "0 + 0 should equal 0");
    }
}
