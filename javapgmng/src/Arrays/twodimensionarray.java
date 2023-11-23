package Arrays;

import java.util.Scanner;

public class twodimensionarray {

	public static void main(String[] args) {
		
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int a[][] = new int[rows][columns];//2 dimension array declaration
		
		System.out.println("Enter elements in array");
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)			
		       a[i][j]=sc.nextInt();
		
		//print array using for each loop
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");//print is used to print in sameline
			}
			System.out.println();//just to jump into nextline
		}
		
		
		

	}

}
