package com.java.ArraysPrograms;

public class PrintOddAndEvenNumberFromArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
// Normal For Loop
		int a[]= {1,2,3,4,5,6,7,8,9};
		int odd =0;
		int even =0;
		/*System.out.println("Length of array is : "+ a.length);
		System.out.println("Even Numbers are : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 ==0) {
				System.out.println(" " + a[i]);
				even++;
			}}
		
		System.out.println("Odd Numbers are : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 !=0) {
				System.out.println(" " + a[i]);
				odd++;
			}}
		System.out.println("No.of Odd : "+ odd + " " +"No.of Even : "+ even);*/
		
		//Enhanced For Loop
		System.out.println("Even Numbers are : ");
		for(int value:a) {
			if(value%2 ==0) {
				System.out.println(value);
				even++;
			}
		}
		System.out.println("Total Even Numbers are : " + even);
		
		System.out.println("odd Numbers are : ");
		for(int value:a) {
			if(value%2 !=0) {
				System.out.println(value);
				odd++;
			}
		}
		System.out.println("Total Even Numbers are : " + odd);
		
	}

}
