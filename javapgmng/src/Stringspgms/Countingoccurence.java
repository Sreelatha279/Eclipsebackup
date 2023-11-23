package Stringspgms;

import java.util.Scanner;

public class Countingoccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S1=sc.nextLine();
		System.out.println(S1);
		
		S1=S1.replace(" ","");
		System.out.println(S1);
		
		String S2=S1.toUpperCase();
		
		System.out.println(S2);
		
		int arr[]=new int[26];
		
		for(int i=0;i<S2.length();i++)
		{
			int index=S2.charAt(i)-65;
			
			arr[index]=arr[index]+1;
			
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((char)(i+65)+" is repeated "+arr[i]+" times");
		}

	}

}
