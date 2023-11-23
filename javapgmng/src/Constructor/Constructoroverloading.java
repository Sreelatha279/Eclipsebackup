package Constructor;

public class Constructoroverloading {
	
	int a;
	double b;
	int c=0;
	
	
	Constructoroverloading()
	{
		a=10;
		b=5;
		
	}
	Constructoroverloading(int x, double y)
	{
		a=x;
		b=y;
	}
	Constructoroverloading(double y, int x)
	{
		a=x;
		b=y;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("first constructor");
		Constructoroverloading O1= new Constructoroverloading();
		O1.display();
		
		System.out.println("Second constructor");
		Constructoroverloading O2= new Constructoroverloading(100,20.25);
		O2.display();
		
		System.out.println("Third constructor");
		Constructoroverloading O3= new Constructoroverloading(11.05,125);
		O3.display();

	}

}
