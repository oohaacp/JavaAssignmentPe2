package com.stackroute.pe2;

public class EvenNumber
{
    // Result returns boolean value
    // Non-Static variables are not acccepted inside static methods
    static boolean result;

    public static boolean isEven(int number)
    {
        if(number%2==0)
        {
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }

}


