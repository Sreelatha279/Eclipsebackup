package Objectclass;

public class Object1 {
	
	int a=10;
	
	 void add()
	{
		int b=10;
		int c=5;
		int d=c+b;
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		
		Object1 t=new Object1();
		System.out.println(t.a);
		
		t.add();
		
		
		

	}

}
