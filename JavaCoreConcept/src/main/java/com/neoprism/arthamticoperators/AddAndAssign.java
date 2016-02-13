package com.neoprism.arthamticoperators;

import java.util.Scanner;

public class AddAndAssign {

	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
     System.out.println("Adding two numbers and assign to first variable");
     int i,j;
     int sum=0;
     System.out.println("Enter the value of i:");
     i=in.nextInt();
     System.out.println("Enter the value of j:");
     j=in.nextInt();
     sum=i+j;
     sum=i;
     System.out.println("Sum value:"+sum);
     System.out.println("new assigned value:"+i);
	}

}
