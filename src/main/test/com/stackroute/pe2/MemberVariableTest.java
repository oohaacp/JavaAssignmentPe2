package com.stackroute.pe2;
import org.junit.*;
import static org.junit.Assert.*;

public class MemberVariableTest
{



    MemberVariable ob=new MemberVariable();
        Question3 app;
        Question3.MemberVariable app2;

        @BeforeClass
        public static void setUpOnce() {


        }

        @AfterClass
        public static void teardownOnce() {


        }

        @Before
        public void setUp() {

            app = new Question3();
            app2 = app.new MemberVariable();
        }

        @After
        public void tearDown() {

            app = null;
        }

        @Test
        public void FirstPalindromeSuccess() {
            //Arrange
            String [] expectedValue = {"Harry Potter", "30", "2500.3"};

            //Act
            String [] actualValue = app2.isMember("Harry Potter",30,2500.3);
            //Assert
            assertArrayEquals(expectedValue, actualValue);

            assertNotNull(actualValue);

        }


    }






