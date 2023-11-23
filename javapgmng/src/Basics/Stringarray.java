package Basics;

public class Stringarray {
//find particular string in string array
	public static void main(String[] args) {
		String arr[] = { "Bestselelr", "Mobile", "Fashion", "electronics", "newrelease", "prime", "computers" };
		String find = "prime";
		for (int i = 0; i < arr.length; i++) 
		{
			if (find == arr[i]) 
			{
				System.out.println("find is present "+arr[i]+" at position "+ i);
			}
		}
		

	}

}
