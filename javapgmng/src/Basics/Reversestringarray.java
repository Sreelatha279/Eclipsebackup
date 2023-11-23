package Basics;

import java.util.Scanner;

public class Reversestringarray {

	public static void main(String[] args) 
	{

		String S1= "hoga beda hudugi nanna bittu";
		String[] arr=S1.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
