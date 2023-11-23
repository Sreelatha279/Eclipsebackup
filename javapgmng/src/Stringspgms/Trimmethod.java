package Stringspgms;

import java.util.Scanner;

public class Trimmethod {

	public static void main(String[] args) {
		
		System.out.println("Enter input value");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();//yo read complete line with spaces
		
		System.out.println(S);
		int length=S.length();
		System.out.println(length);
		
		
		String Str=S.trim();//only deletes starting & ending spaces not the space in between strings
		
		System.out.println(Str);
		
		System.out.println(Str.length());
		

	}

}
