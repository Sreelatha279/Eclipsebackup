package Stringspgms;

public class Stringassign {

	public static void main(String[] args) {
	String s="a2b3c4"; 
	StringBuilder Output=new StringBuilder();
	
			
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isDigit(ch)) {

			int digit = Character.getNumericValue(ch);// if we use only ch it will take ASCII value
			//System.out.println(digit);
			char prevchar = s.charAt(i - 1);
			for (int t = 0; t < digit; t++) {

				Output = Output.append(prevchar);

			}

		} else {
			Output.append(ch);
		}

	}
	System.out.println(Output);
}

}
