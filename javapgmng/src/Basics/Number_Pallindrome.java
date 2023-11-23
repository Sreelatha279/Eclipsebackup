package Basics;

import java.util.Scanner;

public class Number_Pallindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
		int input=sc.nextInt();
		
		pallindrome(input);
		
	}
	
	static void pallindrome(int input)
	{
		int no=input;
		int rev=0;
		while(no>0)
		{
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		}
		if(rev==input)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
			
		}
		
		
	}

}
