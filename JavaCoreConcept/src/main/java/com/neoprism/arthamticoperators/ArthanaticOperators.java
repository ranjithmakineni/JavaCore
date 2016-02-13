package com.neoprism.arthamticoperators;

 
import java.util.Scanner;

public class ArthanaticOperators {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		 System.out.println("*Arithmetic operators example*");
         
         int i,j,k;
         double l;
         
         System.out.println("Enter the value of i:");
         i=a.nextInt();
         
         System.out.println("Enter the value of j:");
         j=a.nextInt();
         k=i+j;
         System.out.println("k = " + k);
         k=i-j;
         System.out.println("k = " + k);
         k=i*j;
         System.out.println("k = " + k);
         l=i/j;
         System.out.println("l = " + l);
 }
		 

}

