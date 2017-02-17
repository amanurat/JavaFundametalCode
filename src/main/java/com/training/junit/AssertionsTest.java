package com.training.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertValues() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = null;
        int var1 = 1;
        int var2 = 1;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        assertTrue("Variable var1 should be equals var2 ", var1 == var2);

        assertEquals("Value of obj1 should be equals obj2", obj1, obj2);

        assertNotNull(obj1);

        assertNull(obj3);

    }

}