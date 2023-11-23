package Loops;

import java.util.Scanner;

public class Continuestatement {

	public static void main(String[] args) {
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		for(int i=0;i<=input;i+=1)
		{
			if(i==10)
			{
				continue;//10 will not print as there is no print statement inside if it will go back to for loop
			}
			System.out.println(i);

		}
		
		
	}
	

}
