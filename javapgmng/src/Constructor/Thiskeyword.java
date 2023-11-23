package Constructor;

public class Thiskeyword {
	
	int a;
	double b;
	int c=0;
	//Thiskeyword is used whenever there are same local & globale variables
	
	Thiskeyword(int a,double b)
	{
		this.a=a;
		this.b=b;	
		
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Thiskeyword O1= new Thiskeyword(105,20.25);
		O1.display();
		
	}

}
