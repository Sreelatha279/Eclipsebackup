package Moolyapgmng;

import java.util.Scanner;

public class Removevowelsinstring {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S=sc.nextLine();
	
	String newStr;
	
	newStr=S.replaceAll("[aeiouAEIOU]", "");
	
	
		System.out.println(newStr);
		// usage of string value of
//		for(int i=0;i<newStr.length();i++)
//			System.out.println(String.valueOf(newStr.charAt(i)));
		
	
	}

}
