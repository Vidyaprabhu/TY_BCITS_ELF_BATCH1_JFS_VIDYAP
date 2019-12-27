package com.patternPrograms;

import java.util.Scanner;

public class prg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
        for(int i=0;i<n;i++) {
        	for (int j = 0; j <n; j++) {
				if(i+j<n)
					System.out.print("*");
				
			}
        	System.out.println();
        }
	}

}

