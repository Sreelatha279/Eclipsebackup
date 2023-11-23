package Objectclass;

public class Initialisingobject {
	
	String empname;
	int salary;
	int empid;
	int deptno;
	
	void display()
	{
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String[] args) {
		
		Initialisingobject Obj = new Initialisingobject();
		Obj.empname="Gopi";
		Obj.empid=101;
		Obj.salary=30000;
		Obj.deptno=11;
		Obj.display();
		
		Initialisingobject Obj1 = new Initialisingobject();
		Obj1.empname="krishna";
		Obj1.empid=222;
		Obj1.salary=50000;
		Obj1.deptno=12;
		Obj1.display();
		
		

	}

}
