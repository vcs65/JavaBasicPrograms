package com.java.ArraysPrograms;

import java.util.Arrays;

public class EqualityofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,23,4,5,6};
		boolean check = Arrays.equals(a, b);
		System.out.println(check);
		
		//method 2
		int a1[] = {1,2,3,4,6};
		int a2[] = {1,2,3,4,6};
		boolean status = true;
		
		if(a1.length == a2.length) {
			for(int i =0;i<=a1.length-1;i++) {
				if(a1[i]!=a2[i]) {
					status = false;
				}
			}
			System.out.println("Arrays are equal");
		}else {
			status = false;
			System.out.println("Arrays are not equal");
		}
		
		

	}

}
