package com.java.ArraysPrograms;

public class MinimumAndMaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {23,343,213,51,982};
        
        int min =0;
        int max =0;
        
        for(int i=0;i<=a.length-1;i++) {
        	if(i<a[i]) {
        		System.out.println(min);
        	}
        }
	}

}
