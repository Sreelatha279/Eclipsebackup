package Arrays;

import java.util.Scanner;

public class Array2dimension {

	public static void main(String[] args) {
		
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int a[][] = new int[rows][columns];//2 dimension array declaration
		a[0][0] = 10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=38;
		a[2][1]=23;
		
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<=1;j++)
//			{
//				System.out.print(a[i][j]+" ");//print is used to print in sameline
//			}
//			System.out.println();//just to jump into nextline
//		}
		
		//using for each loop
		
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
