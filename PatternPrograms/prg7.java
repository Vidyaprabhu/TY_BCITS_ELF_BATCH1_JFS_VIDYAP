package com.patternPrograms;

import java.util.Scanner;

public class prg7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j = 1; j <=n; j++) {
				if(j==n||i+j==n+1) 
					System.out.print("*");

				else
					System.out.print(" ");
			}      	
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for (int j = 1; j <=n; j++) {
				if(j==n||i==j)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	}

}
