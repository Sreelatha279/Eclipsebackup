package Constructor;

public class Assigningvariables {

	String Stdname;
	int Stdclass;
	char Stdsec;
	
	//Assigningvariables(String Stdname,int Stdclass,char Stdsec) not recommended to use same variable name
	
	Assigningvariables(String name,int Std,char sec)//constructor is used to Assigning class variables
	{
		
		Stdname=name;
		Stdclass=Std;
		Stdsec=sec;
		
		System.out.println("student name is "+ Stdname);
		System.out.println("student class is "+ Stdclass);
		System.out.println("student section is "+ Stdsec);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		new Assigningvariables("mythri", 1, 'A');
		new Assigningvariables("triveni", 2, 'B');

	}

}
