package org.sample;

public class Arrtask2 {
	  public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
			sum=sum+a[i];
		System.out.println("Sum of the array element:"+sum);
		
	double average= sum/a.length;
	System.out.println("Array value of the array element is :"+ average);
			
		}
	}

