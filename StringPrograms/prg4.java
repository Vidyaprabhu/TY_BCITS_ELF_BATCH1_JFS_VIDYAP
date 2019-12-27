package org.stringPrograms;
import java.util.Scanner;

public class prg4 {
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
		String lastWord="";
		String word="";
		int count=0;
		int flag =0;
		String str1="";
		for(int j=str.length()-1;j>=0;j++)
		{
			if(str.charAt(j)!=' ')
				lastWord=lastWord+str.charAt(j);
		}
		newstr=newstr+rev(lastWord);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				while(str.charAt(i+1)!=' ')
					word=word+str.charAt(i);
				if(count%2!=0)
				{while(str.charAt(i+1)!=' ')
					newstr=newstr+str.charAt(i);
				}

				if(str.charAt(i)==' '|| i==str.length()-1)
				{
					if(i==str.length()-1)
						str1=str1+str.charAt(i);


					newstr=newstr+" "+rev(str1);
					str1="";
					flag=1;

				}
				else
				{
					str1=str1+str.charAt(i);
				}
			}
		}
	}
}
