package Basics;

public class Pallindrome {

	public static void main(String[] args) {
		String S1="mom";
		String rev="";
		for(int i=S1.length()-1; i>=0; i--)
		{
			rev=rev+S1.charAt(i);
			
		}
		System.out.println(rev);
		if(S1.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a pallindrome");
		}

	}

}
