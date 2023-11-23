package Stringspgms;

import java.util.Scanner;

public class Isemptymeth {

	public static void main(String[] args) {
		System.out.println("Enter input value");
		Scanner sc=new Scanner(System.in);
		String S1=sc.nextLine();
		
		if(S1.isEmpty())
			System.out.println("String is empty");// provide 2 enters to get empty string in console
		else
			System.out.println("String is not empty");
		

	}

}
