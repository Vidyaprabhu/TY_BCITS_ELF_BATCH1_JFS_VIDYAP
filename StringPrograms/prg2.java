package org.stringPrograms;
import java.util.Scanner;

public class prg2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String newstr="";
		int count=0;	

		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				newstr=newstr+count+" ";
				count=0;			
			}
			else if(i==str.length()-1)
			{
				count++;
				newstr=newstr+str.charAt(i)+count;

			}
			else {
				newstr=newstr+str.charAt(i);
				count++;
			}
		}
		System.out.println(newstr);
	}
}
