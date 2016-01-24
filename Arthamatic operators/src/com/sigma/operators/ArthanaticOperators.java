package com.sigma.operators;

import java.util.Scanner;

public class ArthanaticOperators {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		 System.out.println("Arithmetic operators example :");
         
         int i,j,k;
         double l;
         
         System.out.println("Enter the value of i:");
         i=in.nextInt();
         
         System.out.println("Enter the value of j:");
         j=in.nextInt();
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
