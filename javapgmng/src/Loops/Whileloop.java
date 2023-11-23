package Loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) 
	
	{
		//print 1to 10
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int i=1;
		while(i<=input)
		{
			System.out.println("numbers are "+i);
			i++;
		}
		
		//print even number
		System.out.println("Enter input number");
				Scanner sc1 = new Scanner(System.in);
				int input2=sc1.nextInt();
				int j=2;
				while(j<=input2)
				{
					System.out.println("numbers are "+j);
					j+=2;
				}
	}

}
