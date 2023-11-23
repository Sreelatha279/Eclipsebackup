package Loops;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		//print odd numbers
		int i=1;
		do
		{
			System.out.println("Odd numbers are "+i);
			i+=2;
		}while(i<=input);

	}

}
