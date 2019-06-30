package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PalindromeTest
{
  Palindrome p;
    @Test
    public void palindromeCheck(){
      p=new Palindrome();
      String r=p.palindromeMethod("hello");
      assertEquals("olleh",r);
    }
    @Test
    public void emptyPalindrome()
    {
      p=new Palindrome();
      String result=p.palindromeMethod(" ");

      //assert
      assertEquals(" ",result);

    }
    @Test
    public void palindromeChek(){
      p=new Palindrome();
      String r=p.palindromeMethod("wow");
      assertEquals("wow",r);
    }

  }



