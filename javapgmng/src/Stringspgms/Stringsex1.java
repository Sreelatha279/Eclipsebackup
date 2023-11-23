package Stringspgms;

public class Stringsex1 {

	public static void main(String[] args) {
	
		
	String s="Welcome ";
	
	//Finding length of string
	
	int size=s.length();
	System.out.println(size);
	
	//concatenation
	
	String s1="to java";
	String T=s.concat(s1);
	System.out.println(T);//using concat menthod
	System.out.println(s+s1);//using +operator
	System.out.println("welcome "+"to java");//using direct value
	
	//equals compare the strings
	String S3="WELCOME ";
	
	System.out.println(S3.equals(s)); //because java is casesenstive its printing false
	System.out.println(S3.equalsIgnoreCase(s));
	
	//contains
	
	System.out.println(S3.contains("WEL"));//true
	System.out.println(S3.contains("ABC"));//false
	
	//substring
	String s4="sreelatha";
	
	System.out.println(s4.substring(3));//elatha
	System.out.println(s4.substring(0, 3));//sre
	
	//replace
	
	String a="my name is sreelatha & my friend name is latha";
	
	System.out.println(a.replaceAll("name", "hesaru"));
	
	System.out.println(a.replaceFirst("name", "hesaru"));
	
	
//creating string object using String literal	
String t="welcome";//stores in constant poola area doesn't allow duplicates
String t1="welcome";// In Strings only object will get created and mutilple reference variables will get pointed to the same object

System.out.println(t.contains("WEL"));

System.out.println(t);
System.out.println(t1);

//creating string object using new keyword
String m=new String("sreelatha");//non constant pool area allows duplicates
String m1=new String("sreelatha");//duplicate object creates

System.out.println(m);
System.out.println(m1);


	

	}

}
