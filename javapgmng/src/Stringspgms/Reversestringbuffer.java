package Stringspgms;

import java.util.Scanner;

public class Reversestringbuffer {

	public static void main(String[] args) {
		System.out.println("Enter input value");
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		
		StringBuffer T=new StringBuffer(S);//stores string in the form of character array
		//System.out.println(T);
		//System.out.println(T.charAt(0));
		System.out.println(T.charAt(2));
		
		T.insert(2, 'm');//replace character at 2nd index with character m
		System.out.println(T);
		
		T.append("sreelatha");//concatanate string
		System.out.println(T);
		
		T.reverse();//REVERSE STRING USING STRINGBUFFER CLASS
		System.out.println(T);
		
	
	}

}
