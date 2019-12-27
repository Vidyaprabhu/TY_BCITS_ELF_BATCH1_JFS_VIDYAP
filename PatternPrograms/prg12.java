package com.patternPrograms;

import java.util.Scanner;

public class prg12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1||i==((n/2)+1)||j==((n/2)+1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}
}
