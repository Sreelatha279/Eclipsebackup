package Loops;

import java.util.Scanner;

public class Breakstatement {
	
	

	public static void main(String[] args) {
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		for(int i=0;i<=10;i+=2)
		{
			if(i==10)
			{
				break;
			}
			System.out.println(i);

		}
		
		
	}

}
