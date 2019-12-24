package com.hackerRankProblems;

import java.util.*;

class prob3 {
	public static void main(String[] argh) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of records");
		int n = scanner.nextInt();
		scanner.nextLine();
		HashMap<String, Long> hm = new HashMap<String, Long>();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the " + i + "th name ");
			String name = scanner.nextLine();
			System.out.println("enter the phone number");
			long phoneNumber = scanner.nextLong();
			scanner.nextLine();
			hm.put(name, phoneNumber);
		}
		System.out.println(hm);
		System.out.println("enter the number of queries");
		int m = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < m; i++) {
			System.out.println("enter the name");
			String name1 = scanner.nextLine();
            Long number=hm.get(name1);
			if (number!=null) {
				System.out.println(name1 + "=" + number);
			} else {
				System.out.println("not found");
			}
		}
	}
}
