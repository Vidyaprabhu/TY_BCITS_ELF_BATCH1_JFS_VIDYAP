package com.patternPrograms;

import java.util.Scanner;

public class prg6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
        	for (int j = 1; j <=n; j++) {
				if(i+j>=n+1)
					System.out.print("*");
				else
					System.out.print(" ");}
				for (int k = 2; k <=n; k++) {
			        if(i>=k)
			    	    System.out.print("*");
			          }      	
                System.out.println();
        	}
        	
		}
		
	
	}

			
  

