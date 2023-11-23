package Objectclass;

public class InitialisingMegthod {

	String empname;
	int salary;
	int empid;
	int deptno;
	
	void setData(String name, int id, int dno, int sal)
	{
		empname=name;
		salary=sal;
		empid=id;
		deptno=dno;
		
	}
	
	
	void display()
	{
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String[] args) {
		
		InitialisingMegthod Obj = new InitialisingMegthod();
		Obj.setData("Gopi", 101, 11,30000);
		Obj.display();
		
		Obj.setData("Krishna", 102, 120,50000);
		Obj.display();
	
				

	}

}
