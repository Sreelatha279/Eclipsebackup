package Basics;

import java.util.Scanner;

public class String_Pallindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
		String input=sc.next();
		
		pallindrome(input);

	}

	private static void pallindrome(String input) 
	{
		String S1=input;
		String rev="";
		for(int i=S1.length()-1;i>0;i--)
		{
			rev=rev+S1.charAt(i);
			
		}
		System.out.println("reversed string is "+rev);
		if(rev.equals(S1))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
		
	}

}
