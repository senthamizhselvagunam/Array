package org.arraycon;

import java.util.Arrays;

public class Arraysort {
	
	public static void main(String[] args) {
		
		int [] arr= {70,30,50,10,40,60,20,100,120};
		
	System.out.println("===========After Sorting Non-Manually=============");		Arrays.sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
		
//		System.out.println("===========After Sorting Manually=============");
//		for (int i = 0; i < arr.length - 1; i++) 
//				for (int j = i+1; j < arr.length; j++) 
//					if (arr[i] > arr[j]) {
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//		
//		for (int x : arr) 
//			System.out.print(x + " ");
//		
//		System.out.println();
//		
//		System.out.print("Min Value : " +arr[0] + "\n");
//		System.out.print("Max Value : " +arr[arr.length - 1] + "\n");
//		System.out.print("2nd Min Value : " +arr[1] + "\n");
//		System.out.print("2nd Max Value :" +arr[arr.length - 2] + "\n");
//	}
//
//}
