package com.patternPrograms;

import java.util.Scanner;

public class prg8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j = 1; j <=n; j++) {
				if(j==n/2+1||i==n/2+1)
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}