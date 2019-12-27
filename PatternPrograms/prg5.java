package com.patternPrograms;

import java.util.Scanner;

public class prg5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
        for(int i=0;i<n;i++) {
        	for (int j = 0; j < n; j++) {
   				if(i>=j)
					System.out.print("*");
    			}
      
          	System.out.println();
        }
        for(int i=1;i<=n-1;i++) {
        	for (int j = 1; j <=n-1; j++) {
				if(i+j<=n)
					System.out.print("*");
				}
          		System.out.println();
          				
			}
        }
	}
