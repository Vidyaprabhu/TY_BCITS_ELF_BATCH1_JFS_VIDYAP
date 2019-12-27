package org.stringPrograms;
import java.util.Scanner;

public class prg3 {
	static String rev(String str12) {
		String str1="";
		for(int i=str12.length()-1;i>=0;i--)
		{
			str1=str1+str12.charAt(i);
		}
		return str1;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String newstr="";
		int j=0;
		String str1="";
		for(int i=0;i<str.length();i++)
		{

			if(str.charAt(i)==' '|| i==str.length()-1)
			{
				if(i==str.length()-1)
					str1=str1+str.charAt(i);

				newstr=newstr+" "+rev(str1);
				str1="";
			}
			else
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}
}

