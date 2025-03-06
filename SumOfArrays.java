package com.java.ArraysPrograms;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("Enter the list of arrays : "); sc.nextInt();
		 *
		 */
		//Method1 using length of array
		int a[] = {25,3,2,9};
		int sum = 0;
		for(int i = 0; i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of the array is :" + sum);
		
		
// using hardcode and giving the lend the for loop
		int sum1 = 0;
		for(int j= 0 ; j<=3;j++ ) {
			 sum1 = sum1+ a[j];
		}
		System.out.println("Sum of the array is :" + sum1);
	
	
	// using enhanced  For loop
	 int b[] = {1,2,3,4,6,5};
	 int tot = 0;
	 
	for (int i : b) {
		tot = tot + i;
	}
	System.out.println("Sum of the array is :" + tot);
	}
}
