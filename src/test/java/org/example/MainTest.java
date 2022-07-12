package org.example;

import static org.example.Main.func;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestFunc() {
        String actual = func (2, 3,4,2);
        String expected = "Yes!";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc1() {
        String actual = func (1, 1,8,8);
        String expected = "No!";
        assertEquals(expected, actual);
    }
}