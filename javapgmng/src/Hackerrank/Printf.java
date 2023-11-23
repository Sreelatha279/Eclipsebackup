package Hackerrank;

public class Printf {

	public static void main(String[] args) {
		 String name = "John";
	        int age = 30;
	        String name1 = "Johnabrahim";
	        int age1 = 100;
	        System.out.println("Hello, my name is %s and I am %d years old.%n");
	        
	        System.out.printf("Hello, my name is %s and I am %d years old.%n", name, age);
	        System.out.printf("%s  %d .%n", name, age);
	        System.out.printf("%s  %d .%n", name1, age1);
	        //find string length and use append
	        
	        String formattedString = String.format("%-" +15+ "s", name); // Left-justified with trailing spaces
            String formattedInteger = String.format("%0"+3+  "d", age);
            System.out.println(formattedString + formattedInteger);	
            

	}

}
