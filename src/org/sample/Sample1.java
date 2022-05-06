package org.sample;

public class Sample1 {
	
	 public static void main(String[] args) {
		 
		 int a[]=new int[5];
		 
		  a[3]=50;
		  a[0]=80;
		  a[2]=70;
		  a[3]=90;
		  a[3]=40;
		   
		  System.out.println(a[2]);
		  System.out.println(a[0]);
		  
		  System.out.println(a.length);
		  
		  System.out.println("\nusingNormal For loop");
		   for (int i = 0; i < a.length; i++) {
			   System.out.println(a[i]);
			
		}
		  
		  System.out.println("\nusingenhanced For loop");
		  for (int z : a) {
			  
			  System.out.println(z);
			
		}
			
		}
		  
				 
		
		
	}

