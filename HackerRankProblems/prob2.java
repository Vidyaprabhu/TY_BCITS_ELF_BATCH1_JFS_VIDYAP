package com.hackerRankProblems;
import java.util.*;

public class prob2 {
	static Scanner scanner=new Scanner(System.in);
	static List<Integer> list = null;
	public static void main(String[] args) {
		int n=0;
		System.out.println("enter the number of values");
		n=Integer.parseInt(scanner.nextLine());
		list=new ArrayList<Integer>(n);
		for (int i = 0; i <n ; i++) {
			System.out.println("enter the value for "+i+"th position");
			list.add(i,Integer.parseInt(scanner.nextLine()));
		}System.out.println(list);
		System.out.println("enter the number of queries");
		int q=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < q; i++) {
			System.out.println("enter the insert/delete");
			String query=scanner.nextLine();
			if(query.equalsIgnoreCase("insert"))
			{
              System.out.println("enter the index value");
              int x=Integer.parseInt(scanner.nextLine());
              System.out.println("enter the value");
	          int y=Integer.parseInt(scanner.nextLine());
	          list.add(x,y);
			}
			else if(query.equalsIgnoreCase("delete"))
			{
				System.out.println("enter the index value");
                 int x=Integer.parseInt(scanner.nextLine());
                 list.remove(x);
			}
			else
				System.out.println("enter the valid query");
			System.out.println(list);

		}

	}
}
