package org.sample;

import java.util.HashSet;
import java.util.Set;

public class Arrtask3 {
	public static void main(String[] args) {
		
	
		 
		Set s= new HashSet();
		int a[]= {10,20,30,40,50,60,60,50,80,90,80};
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
			System.out.println(s);
		}

}