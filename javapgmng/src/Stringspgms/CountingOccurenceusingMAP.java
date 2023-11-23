package Stringspgms;

import java.util.HashMap;
import java.util.Scanner;

public class CountingOccurenceusingMAP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String S1=sc.nextLine();
		
		S1=S1.replace(" ", "");
		S1=S1.toUpperCase();
		
		HashMap<Character, Integer> a= new HashMap<>();
		
		char[] c=S1.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			char character=c[i];
			if(Character.isLetter(character))
			{
				a.put(character, a.getOrDefault(character, 0)+1);
				
			}
		}
		
		for(char letter='A';letter<='Z';letter++)
		{
			int count=a.getOrDefault(letter, 0);
			System.out.println(letter+" is repeated "+count);
		}
		
	}

}
