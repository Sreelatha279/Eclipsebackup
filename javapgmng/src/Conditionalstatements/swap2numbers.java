package Conditionalstatements;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		

	}

}
