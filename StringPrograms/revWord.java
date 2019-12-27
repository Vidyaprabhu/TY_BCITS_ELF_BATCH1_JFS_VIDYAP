package org.stringPrograms;
import java.util.Scanner;

public class revWord {
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
		int count=0;
		int flag=0;
		String str1="";
		for(int i=0;i<str.length();i++)
		{

			 if(str.charAt(i)==' '|| i==str.length()-1)
			{
				if(i==str.length()-1)
					str1=str1+str.charAt(i);
				if(count%2==0) {
					newstr=newstr+" "+rev(str1);
					str1="";
				}
				else
				{
					newstr=newstr+" "+str1;
					str1="";
				}
				count++;
			}
			else
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}
}

