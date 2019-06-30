package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PowerTest
{

        private Power power;
        private int num;

        @Before
        public void setUp() throws Exception {


            power = new Power();

        }

        @After
        public void tearDown() throws Exception {

        }


        @Test
        public void validPower() throws Exception {

            Boolean expectedValue =true;//checking actual and excepted output//

            Boolean actualValue = power.isPower(16);
            assertEquals(expectedValue, actualValue);

        }
        @Test
        public void invalidPower() throws Exception {

            Boolean expectedValue =false; //checking actual and excepted output//

            Boolean actualValue = power.isPower(43);
            assertEquals(expectedValue, actualValue);

        }



}