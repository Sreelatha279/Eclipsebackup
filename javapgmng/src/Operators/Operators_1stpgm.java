package Operators;

public class Operators_1stpgm {

	public static void main(String[] args) 
	{
		System.out.println("=================");
		//Arithematic Operators + - * / %
		
		int a=10,b=5;
		
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a*b);//50
		System.out.println(a/b);//2 - quotient
		System.out.println(a%b);//0 - reminder
		System.out.println("=================");
		//Relational Operators < > <= >= == != - return type is boolean
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("=================");
		//Logical operators && || ! return type is boolean
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println("=================");
		//Assignment operator = += -= *= /=
		
		int c=a;//10
		System.out.println(c);
		c=b;//5
		System.out.println(c);
		c+=5; //c=C+5
		System.out.println(c);
		c-=2;
		System.out.println(c);
		c*=5;
		System.out.println(c);
		c/=5;
		System.out.println(c);//8
		
		
		System.out.println("=================");
		//increment 
		c=c++;
		System.out.println(c);//8
		
		System.out.println("=================");
		//decrement
		c=c--;
		System.out.println(c);//8
		
		
		
		
		
		
				

	}

}
