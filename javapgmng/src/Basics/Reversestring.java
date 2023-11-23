package Basics;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String S1=sc.next();
//		String S1="ilikeChatura";
//		String rev="";
// 		Reversing a string		
//		for(int i=S1.length()-1; i>=0;i--)
//		{
//		rev=rev+S1.charAt(i);
//		}
//		System.out.println(rev);
//		System.out.println(S1.toUpperCase()); // converting string to uppercase
//		System.out.println(S1.toCharArray());// converting string to character array
//		System.out.println(S1.substring(2));// finding substring
//	
	// Counting vowels in a string
		char[] ch=S1.toCharArray();
		for(int i=0;i<S1.length();i++)
		{
			System.out.println("Character Array at index "+i+" "+S1.charAt(i));
		}
		int count=0;
		for(int i=S1.length()-1; i>=0;i--)
		{
			if (S1.charAt(i) == 'a' || S1.charAt(i) == 'e' || S1.charAt(i) == 'i' || S1.charAt(i) == '0' || S1.charAt(i) == 'u') {
				System.out.println("Vowels are "+S1.charAt(i));
								count++;
				
						
			}
			
		}
		System.out.println(count);
	}

}
