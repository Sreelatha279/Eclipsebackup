package Arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array");
	     int m=sc.nextInt();
	     int arr[]=new int[m];
	     
	     System.out.println("Enter elements of array ");
	     
	     for(int i=0;i<m;i++)//0;0<5;
	     {
	    	 
	         	 arr[i]=sc.nextInt();
	     }
	     
	     int arr1[]=new int[m];
	     for(int i=0;i<m;i++)
	     {
	    	
	         	 arr1[i]=arr[i];
	     }
	     for(int b:arr1)
	    	 System.out.println(b);
	     

	}

}
