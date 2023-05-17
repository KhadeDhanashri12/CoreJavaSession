package arraysofobjects;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
Employee emp[]= new Employee[4];
	
	
	void addData() //e1=emp
	{
		/*Employee e1= new Employee(23,"Raj","HR",70000); // a=b  c=a   c=b
		emp[0]=e1;*/
		
		/*emp[0]=new Employee(23,"Raj","HR",70000);
		emp[1]=new Employee(10,"Riya","Sales",60000);
		emp[2]=new Employee(2,"Ramesh","Technical",55000);
		emp[3]=new Employee(15,"Anjali","HR",80000);
		emp[4]=new Employee(67,"Rahul","Sales",75000);
		emp[5]=new Employee(25,"Ajay","HR",50000);
		emp[6]=new Employee(230,"Kajal","HR",65000);
		emp[7]=new Employee(53,"Sachin","Technical",50000);*/
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter id,name,dept,salary of the employee: ");
			int id= sc.nextInt();
			String name= sc.next();
			String dept= sc.next();
			int salary= sc.nextInt();
			
			Employee e= new Employee(id,name,dept,salary);
			emp[i]=e;
		}
		
	}
	
	void display()
	{
		/*for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}*/
		
//		for(Employee e:emp) //e=emp[0]   e=emp[1]
//		{
//			if(e!=null)
//			{
//				/*if(e.salary>=70000)
//					System.out.println(e.name+" "+e.salary);*/
//				if(e.dept.equalsIgnoreCase("hr") && e.salary>60000)
//					System.out.println(e);
//			}
//				
//			
//		}
		
		System.out.println(Arrays.toString(emp));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a1[]=new int[size];
		
		
		
		EmployeeMain obj= new EmployeeMain();
		
		obj.addData();
		obj.display();
		
		

	}


}
