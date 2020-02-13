package com.techprimers.testing;

import org.junit.jupiter.api.*;

class FizzBuzzTest {

    public FizzBuzz fB;

    @BeforeEach
    public void setUp() {
        fB = new FizzBuzz();
    }

    @DisplayName("kontrol test")
    @Test
    public void test()

    {
        System.out.println("sebolenzo");
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}