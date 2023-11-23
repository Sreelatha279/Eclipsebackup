package Conditionalstatements;

public class Switchcase {

	public static void main(String[] args) 
	{
		/*switch(variable)
		 case condition1://code;break
		 case condition2://code;break
		 case condition3://code;break
		 .... */
		int day=4;
		
		switch (day) 
		{
		
		case 1: System.out.println("Monday"); 
		case 2: System.out.println("Tuesday"); 
		case 3: System.out.println("Wednessday"); break;
		case 4: System.out.println("Thursday"); 
		case 5: System.out.println("Friday"); 
		case 6: System.out.println("Saturday");
		
		default:System.out.println("Sunday");
		}
			

	}

}
