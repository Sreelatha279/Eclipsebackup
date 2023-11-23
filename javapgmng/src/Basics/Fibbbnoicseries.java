package Basics;

public class Fibbbnoicseries {

	public static void main(String[] args) {

//		int fib = 0;
//		for (int i = 0; i <= 10; i++)
//		{
//			fib = fib + i;
//			System.out.println(fib);
//		}
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for (int i=0; i<=5;i++)
		{
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}

}
