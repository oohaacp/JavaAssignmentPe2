package com.stackroute.pe2;

import com.stackroute.pe2.EvenNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest
{
    EvenNumber evennumber;
    boolean result;
    @Before
    public void setUp()
    {
        evennumber=new EvenNumber();
    }
    @Test
    public void givenInputShouldReturnEvenNumber()
    {
        // Static Methods are called using ClassName.
        // No need of objects to call...
        result= EvenNumber.isEven(24);
        assertEquals("Even number condition failed",true,result);
    }
    @Test
    public void givenInputShouldReturnOddNumber()
    {
        result= EvenNumber.isEven(25);
        assertEquals("Odd number condition failed",false,result);
    }
    @Test
    public void givenInputShouldNotReturnEvenNumber()
    {
        result= EvenNumber.isEven(25);
        assertEquals("Odd number condition failed",false,result);
    }

    @After
    public void tearDown()
    {
        evennumber=null;
    }
}