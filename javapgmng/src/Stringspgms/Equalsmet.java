package Stringspgms;

import java.util.Scanner;

public class Equalsmet {

	public static void main(String[] args) {
		System.out.println("Enter input value");
		Scanner sc=new Scanner(System.in);
		String S1=sc.next();
		String S2=sc.next();
		
				
		if(S1.equals(S2))
			System.out.println("String matches");
		else
			System.out.println("String is not matching");

	}

}
