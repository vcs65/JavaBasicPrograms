package com.java.ArraysPrograms;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prerequsit condition
		//lenght should be euql
		//range should be ther i.e 1.....5...
		//duplication is not allowed 
		// no need to sort the array
		
		// this method is to add the sum of given array
		int []a = {1,2,3,4,5,7};	
		int sum =0;
		for(int i = 0; i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println("Sum of the Given array is : " +sum);
		
	//this method  is to add the array till 1 to 7 	
		int range = 0;
		for(int i =1; i<8;i++) {
			range = range + i;
		}
		System.out.println("sum of the range1 to 7 is : " + range);
		
		//now if we subratct sum form range ill get the missing number
		
		int missingnumber =0;
		missingnumber = range - sum;
		System.out.println("Missing number from the array is : "+ missingnumber);
	

	}

}
