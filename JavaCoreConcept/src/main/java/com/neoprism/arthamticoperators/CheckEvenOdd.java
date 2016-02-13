package com.neoprism.arthamticoperators;

import java.util.Scanner;

public class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    boolean even = true;
    boolean odd = false;

    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if(num%2==0)
    {
      even = true;
      System.out.println(true);
    }
    else
    {
      even = false;
      System.out.println(false);
    }



  }
}