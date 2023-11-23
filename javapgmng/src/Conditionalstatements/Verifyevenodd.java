package Conditionalstatements;

import java.util.Scanner;

public class Verifyevenodd {

	public static void main(String[] args) 
	{
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");

		}
	}
	

}
