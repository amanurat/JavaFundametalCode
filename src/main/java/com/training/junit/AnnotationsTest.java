package com.training.junit;

import org.junit.*;

public class AnnotationsTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Code executed before the first test method..");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Code executed after the last test method..");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Code executed before each test method..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Code executed after each test method..");
    }

    @Test
    public void testMethod1() {

        System.out.println("Code executed test method1...");

    }



}
