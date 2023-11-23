package Conditionalstatements;

public class Basiconditions {

	public static void main(String[] args) 
	{
		int age=21;
		//if condition
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		System.out.println("Program exited");
		
		System.out.println("============");
		//if else condition
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}
		System.out.println("Program exited");
		
		System.out.println("============");
		// else-if condition
		int a=7;
		
		if(a==1)
		{
			System.out.println("Monday");
		}
		else if(a==2)
		{
			System.out.println("Tuesday");
		}
		else if(a==4)
		{
			System.out.println("Wednessday");
		}
		else if(a==5)
		{
			System.out.println("Thursday");
		}
		else if(a==6)
		{
			System.out.println("Friday");
		}
		else 
		{
			System.out.println("Sunday");
		}
		
		System.out.println("Program exited");
	}

}
