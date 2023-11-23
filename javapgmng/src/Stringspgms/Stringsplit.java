package Stringspgms;

import java.util.Scanner;

public class Stringsplit {

	public static void main(String[] args) {
		
		System.out.println("Enter input value");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();// read complete line with spaces
		
		String[] words=S.split("\\s");//splits the String based on White space and storing in String array
		
		System.out.println(S);
		for(String i:words)
		System.out.println(i);
		
//		for(int i=S.length()-1;i>=0;i--)
//			System.out.print(S.charAt(i));
//		
		
	}

}
