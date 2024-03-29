package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest
{
    FactorialTest factorialTest;
    @Before
    public void setUp() throws Exception {
        factorialTest=new FactorialTest();
    }

    @After
    public void tearDown() throws Exception
    {
        factorialTest=null;
    }

    @Test
    public void TestlongFactorial() {
        assertEquals(120,Factorial.longFactorial(5));
        assertEquals(2,Factorial.longFactorial(2));
        assertEquals(1,Factorial.longFactorial(0));

    }

}
