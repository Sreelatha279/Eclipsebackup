package Basics;

public class Swapnum {

	public static void main(String[] args) {
		//using temp varaiable
		int a=10;
		int b=5;
		int temp;
		/*temp=b;
		b=a;
		a=temp;
		System.out.println("a = "+a+" b = "+b);*/
		//without using temp varaiable
		a=a+b;//15
		b=a-b;//15-5=10
		a=a-b;
		System.out.println("a = "+a+" b = "+b);
			

	}

}
