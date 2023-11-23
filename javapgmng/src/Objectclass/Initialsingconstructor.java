
package Objectclass;

public class Initialsingconstructor {
	
		
		String empname;
		int salary;
		int empid;
		int deptno;
		
		Initialsingconstructor(String name, int id, int dno, int sal)
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
			
			Initialsingconstructor Obj = new Initialsingconstructor("Gopi", 101, 11,30000);
		
			Initialsingconstructor Obj1 = new Initialsingconstructor("Krishna", 102, 120,50000);
			
			Obj.display();
			
			

		}

	}


