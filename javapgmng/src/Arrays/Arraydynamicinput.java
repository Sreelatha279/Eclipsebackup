package Arrays;

import java.util.Scanner;

public class Arraydynamicinput {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter length of array");
     int m=sc.nextInt();
     int arr[]=new int[m];//arr[]=5
     
     
     
     for(int i=0;i<m;i++)//0;0<5;
     {
    	 System.out.println("Enter elements of array "+(i+1)+":");
         	 arr[i]=sc.nextInt();
     }
   for(int a:arr)
    	 System.out.println("array value of  is "+a);
    	 
	

	}

}
