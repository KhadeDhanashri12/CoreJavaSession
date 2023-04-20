package encapsulation;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Dhanashri");
		e1.setDept("HR");
	    e1.setSalary(90000);
	    e1.setEmail("d@gmail.com");
	   System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary()+" "+e1.getEmail());

	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,dept,salary,email");
		int id=sc.nextInt();
		String name=sc.next();
		String dept = sc.next();
		String email = sc.next();
		double salary=sc.nextDouble();
		Student e2=new Student();
		e2.setId(id);
		e2.setName(name);
		e2.setDept(dept);
		e2.setSalary(salary);
		 e2.setEmail(email);
		 System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getDept()+" "+e2.getSalary()+" "+e2.getEmail());
		 
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter id,name,marks,email,dept");
		int id2=sc.nextInt();
		String name2=sc.next();
		String dept2 = sc.next();
		String email2=sc.next();
		Student e3=new Student();
		e3.setId(id2);
		e3.setName(name2);
		e3.setDept(dept2);
		e2.setSalary(salary);
		e3.setEmail(email2);
		
		//System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getDept()+" "+e2.getSalary()+" "+e2.getEmail());
		
		
		}

}
