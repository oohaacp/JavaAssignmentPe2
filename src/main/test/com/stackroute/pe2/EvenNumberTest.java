package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest
{
    EvenNumber evenNumber;

        @Before
        public void setUp() throws Exception {
            evenNumber=new EvenNumber();
        }

        @After
        public void tearDown() throws Exception {
            evenNumber=null;
        }

        @Test
        public void isEven() {
            assertTrue(evenNumber.isEven(312));
        }//checking even values//
        @Test
        public void isOdd() //checking odd values//
        {
            boolean expectedValue=false;
            boolean actualValue=evenNumber.isEven(313);
            assertEquals(expectedValue,actualValue);

        }
        @Test
        public void isNotOdd() {//checking is NotOdd values//
            boolean expectedValue=false;
            boolean actualValue=evenNumber.isEven(312);
            assertNotEquals(expectedValue,actualValue);
        }

    }


